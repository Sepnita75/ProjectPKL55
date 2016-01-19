/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.panel2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
/**
 *
 * @author M Arif Rosyanto
 */


public class TimeLabel extends JLabel implements Runnable {

    private static final long serialVersionUID = 1L;
    private int jam;
    private int menit;
    private int detik;
    private String dateFormat;
    private Calendar calendar;

    public TimeLabel() {
        super("time");
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, d MMM yyyy").format(calendar.getTime());
        jam = Integer.parseInt(new SimpleDateFormat("HH").format(calendar.getTime()));
        menit = Integer.parseInt(new SimpleDateFormat("mm").format(calendar.getTime()));
        detik = Integer.parseInt(new SimpleDateFormat("ss").format(calendar.getTime()));
        start();
    }

    public void start() {
        Thread thread = new Thread(this, "TimeThread");
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            setText(setTime());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TimeLabel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String setTime() {
        String menitString;
        String detikString;
        String jamString;
        if (detik == 59) {
            detik = 0;
            detikString = "0" + detik;
            menit++;
        } else {
            detik++;
            if (detik < 10) {
                detikString = "0" + detik;
            } else {
                detikString = Integer.toString(detik);
            }
        }
        if (menit == 60) {
            menit = 0;
            menitString = "0" + menit;
            jam++;
        } else {
            if (menit < 10) {
                menitString = "0" + menit;
            } else {
                menitString = Integer.toString(menit);
            }
        }
        if (jam == 24) {
            jam = 0;
            jamString = "0" + jam;
            dateFormat = new SimpleDateFormat("EEE, d MMM yyyy").format(calendar.getTime());
        } else {
            if (jam < 10) {
                jamString = "0" + jam;
            } else {
                jamString = Integer.toString(jam);
            }
        }
        return dateFormat + ", " + jamString + ":" + menitString + ":" + detikString;
    }

}

