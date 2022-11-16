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
        i=1;
        while (activo == true) {
           // i = img.nextInt(6);
            //tiempo = 750 ; //tiem.nextInt(1000);
            tiempo = tiem.nextInt(750);
            if (i == 1) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                
                interfaz.uno.setLocation(550, 100);
                i++;
                try {
                sleep(tiempo);
                } catch (InterruptedException e) { }
                c ++;
            }
            if (i == 2) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(550, 200);
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {            }
                i++;
                c ++;
            }
            if (i == 3) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(550,300 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) { }
                i++;
               c ++;
            }
            
            if (i == 4) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(550,400 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {             }
                i++;
                c ++;
            }            
            
            if (i == 5) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(550,500 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
            
            if (i == 6) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(550,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 7) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(450,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 8) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(350,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 9) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(250,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
               c ++;
            }

            if (i == 10) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(150,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }


            if (i == 11) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(15,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 12) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(15,500 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

             if (i == 13) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(15,400 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
            
             if (i == 14) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(15,300 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             if (i == 15) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(15,200 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             if (i == 16) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(115,200 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             
             if (i == 17) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(215,200 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             if (i == 18) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(315,200 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

             if (i == 19) {
                interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));
                interfaz.uno.setLocation(450,200 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i=2;
                c ++;
                
                if (c> 50 ) {
                    this.activo=false;
                }
                
            }
             
             
            try {
                sleep(tiempo);
            } catch (InterruptedException e) {
            }
        }
}
}
