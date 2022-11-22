package com.mycompany.perifericabus;
import javax.swing.*;
    import java.util.Random;
    import javax.swing.ImageIcon;

/**
 *
 * @author kevda
 */
public class bus1 extends Thread{
    boolean activo = true;
    Random bus = new Random();
    Random tiem = new Random();
    int i = 0;
    int tiempo = 0;
    int c = 0;

@Override
    public void run() {
        i = 1;
        while (activo == true) {
            // i = img.nextInt(6);
            //tiempo = 750 ; //tiem.nextInt(1000);
            tiempo = tiem.nextInt(750);
            if (i == 1) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));

                interfaz.uno.setLocation(300, 620);//punto de inicio
                i++;
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                c++;
            }
            if (i == 2) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(320, 583);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
            if (i == 3) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(370, 600);
                try {
                   Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 4) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(404, 600);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 5) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(400, 628);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 6) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(436, 645);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 7) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(470, 621);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 8) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(512, 586);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 9) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(484, 464);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 10) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(428, 450);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 11) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(396, 428);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 12) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(397, 408);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 13) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(421, 416);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 14) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(445, 430);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 15) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(300, 620);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 16) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(300, 620);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 17) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(300, 620);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 18) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(300, 620);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 19) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(300, 620);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i = 2;
                c++;

                if (c > 50) {
                    this.activo = false;
                }

            }

            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
            }
        }
        
}
}
