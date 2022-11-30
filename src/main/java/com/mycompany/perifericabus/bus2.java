package com.mycompany.perifericabus;
import javax.swing.*;
    import java.util.Random;
    import javax.swing.ImageIcon;
/**
 *
 * @author kevda
 */
public class bus2 extends Thread {
    boolean activo = true;
    Random bus = new Random();
    Random tiem = new Random();
    int i = 0;
    int tiempo = 0;
    int c = 0;

@Override
    public void run() {
        
        
        
        i=1;
        while (activo == true) {
           // i = img.nextInt(6);
            tiempo = tiem.nextInt(750);

            if (i == 1) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));

                interfaz.dos.setLocation(276,354);//punto de inicio
                i++;
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                c++;
            }
            if (i == 2) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(338,385);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
            if (i == 3) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(377,325);
                try {
                   Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 4) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(344,276);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 5) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(351,235);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 6) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(408,237);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 7) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(440,190);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 8) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(503,211);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 9) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(562,194);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 10) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(672,178);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 11) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(747,133);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 12) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(762,191);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 13) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(793,213);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 14) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(801,245);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 15) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(762,275);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 16) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(726,298);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 17) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(735,362);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 18) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(730,422);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }

            if (i == 19) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(704,464);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;}
                if (i == 20) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(730,422);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 21) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(656,457);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 22) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(634,487);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 23) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(589,480);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 24) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(542,466);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 25) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(495,466);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 26) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(395,472);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 27) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(300,465);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 28) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(329,413);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 29) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(285,404);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;
            }
                if (i == 30) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(250,393);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i++;
                c++;}
               if (i == 31) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(271,355);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                }
                i = 2;
                c++;
            }
            if (c > 100) {
                    this.activo = false;
                }

            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
            }
        }
             
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
            }
    }
}

