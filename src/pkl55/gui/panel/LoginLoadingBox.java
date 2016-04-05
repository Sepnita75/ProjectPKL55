package pkl55.gui.panel;

import java.util.logging.Level;
import java.util.logging.Logger;
import pkl55.gui.panel.MainPanel;

/**
 *
 * @author faqih_
 */
public class LoginLoadingBox extends javax.swing.JPanel {

    public LoginLoadingBox() {
        initComponents();
    }

    private boolean go;
    private long time = 0;

    public void stop() {
        if (time > 1500) {
            ball_1.setLocation(ball_1.getLocation().x, 140);
            ball_2.setLocation(ball_2.getLocation().x, 140);
            ball_3.setLocation(ball_3.getLocation().x, 140);
            ball_4.setLocation(ball_4.getLocation().x, 140);
            ball_5.setLocation(ball_5.getLocation().x, 140);
            ball_6.setLocation(ball_6.getLocation().x, 140);

            go = false;
        }
    }

    public void start() {
        time = 0;
        new Thread(new Runnable() {
            @Override
            public void run() {
                go = true;
                int jeda = 150;//kendali
                int add = 1;//kendali
                int top = 110;//kendali
                int bottom = 160;//kendali

                boolean down_1 = true;
                boolean down_2 = true;
                boolean down_3 = true;
                boolean down_4 = true;
                boolean down_5 = true;
                boolean down_6 = true;

                while (go) {
                    if (time >= jeda * 0) {
                        if (down_1) {
                            if (ball_1.getLocation().y <= bottom) {
                                ball_1.setLocation(ball_1.getLocation().x, ball_1.getLocation().y + add);
                            } else {
                                down_1 = false;
                            }
                        } else if (ball_1.getLocation().y >= top) {
                            ball_1.setLocation(ball_1.getLocation().x, ball_1.getLocation().y - add);
                        } else {
                            down_1 = true;
                        }
                    }
                    if (time >= jeda * 1) {
                        if (down_2) {
                            if (ball_2.getLocation().y <= bottom) {
                                ball_2.setLocation(ball_2.getLocation().x, ball_2.getLocation().y + add);
                            } else {
                                down_2 = false;
                            }
                        } else if (ball_2.getLocation().y >= top) {
                            ball_2.setLocation(ball_2.getLocation().x, ball_2.getLocation().y - add);
                        } else {
                            down_2 = true;
                        }
                    }
                    if (time >= jeda * 2) {
                        if (down_3) {
                            if (ball_3.getLocation().y <= bottom) {
                                ball_3.setLocation(ball_3.getLocation().x, ball_3.getLocation().y + add);
                            } else {
                                down_3 = false;
                            }
                        } else if (ball_3.getLocation().y >= top) {
                            ball_3.setLocation(ball_3.getLocation().x, ball_3.getLocation().y - add);
                        } else {
                            down_3 = true;
                        }
                    }
                    if (time >= jeda * 3) {
                        if (down_4) {
                            if (ball_4.getLocation().y <= bottom) {
                                ball_4.setLocation(ball_4.getLocation().x, ball_4.getLocation().y + add);
                            } else {
                                down_4 = false;
                            }
                        } else if (ball_4.getLocation().y >= top) {
                            ball_4.setLocation(ball_4.getLocation().x, ball_4.getLocation().y - add);
                        } else {
                            down_4 = true;
                        }
                    }
                    if (time >= jeda * 4) {
                        if (down_5) {
                            if (ball_5.getLocation().y <= bottom) {
                                ball_5.setLocation(ball_5.getLocation().x, ball_5.getLocation().y + add);
                            } else {
                                down_5 = false;
                            }
                        } else if (ball_5.getLocation().y >= top) {
                            ball_5.setLocation(ball_5.getLocation().x, ball_5.getLocation().y - add);
                        } else {
                            down_5 = true;
                        }
                    }
                    if (time >= jeda * 5) {
                        if (down_6) {
                            if (ball_6.getLocation().y <= bottom) {
                                ball_6.setLocation(ball_6.getLocation().x, ball_6.getLocation().y + add);
                            } else {
                                down_6 = false;
                            }
                        } else if (ball_6.getLocation().y >= top) {
                            ball_6.setLocation(ball_6.getLocation().x, ball_6.getLocation().y - add);
                        } else {
                            down_6 = true;
                        }
                    }

                    repaint();

                    try {
                        Thread.sleep(7);
                        if (time <= 700 * 5) {
                            time += 10;
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LoginLoadingBox.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ball_1 = new javax.swing.JLabel();
        ball_2 = new javax.swing.JLabel();
        ball_3 = new javax.swing.JLabel();
        ball_4 = new javax.swing.JLabel();
        ball_5 = new javax.swing.JLabel();
        ball_6 = new javax.swing.JLabel();
        background_image = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ball_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/loadinglogin.png"))); // NOI18N
        add(ball_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        ball_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/loadinglogin.png"))); // NOI18N
        add(ball_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        ball_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/loadinglogin.png"))); // NOI18N
        add(ball_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        ball_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/loadinglogin.png"))); // NOI18N
        add(ball_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        ball_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/loadinglogin.png"))); // NOI18N
        add(ball_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        ball_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/loadinglogin.png"))); // NOI18N
        add(ball_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/login_background.png"))); // NOI18N
        add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_image;
    private javax.swing.JLabel ball_1;
    private javax.swing.JLabel ball_2;
    private javax.swing.JLabel ball_3;
    private javax.swing.JLabel ball_4;
    private javax.swing.JLabel ball_5;
    private javax.swing.JLabel ball_6;
    // End of variables declaration//GEN-END:variables
}
