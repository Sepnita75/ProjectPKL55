package pkl55.data.model;

import java.util.TimerTask;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UploaderSync extends TimerTask {

	Date now; // to display current time

	// Add your task here
        @Override
	public void run() {
            try {
                Model.sendAll();
            } catch (Exception ex) {
                Logger.getLogger(UploaderSync.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
}