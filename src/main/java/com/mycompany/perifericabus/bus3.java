package com.mycompany.perifericabus;
import javax.swing.*;
    import java.util.Random;
    import javax.swing.ImageIcon;
/**
 *
 * @author kevda
 */

public class bus3 extends Thread {
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
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                
                interfaz.uno.setLocation(550, 100);
                i++;
                try {
                sleep(tiempo);
                } catch (InterruptedException e) { }
                c ++;
            }
            if (i == 2) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(550, 200);
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {            }
                i++;
                c ++;
            }
            if (i == 3) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(550,300 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) { }
                i++;
                c ++;
            }
            
            if (i == 4) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(550,400 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {             }
                i++;
                c ++;
            }            
            
            if (i == 5) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(550,500 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
            
            if (i == 6) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(550,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 7) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(450,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 8) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(350,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 9) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(250,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 10) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(150,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }


            if (i == 11) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(15,575 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 12) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(15,500 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

             if (i == 13) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(15,400 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
            
             if (i == 14) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(15,300 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             if (i == 15) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(15,200 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             if (i == 16) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(115,200 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             
             if (i == 17) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(215,200 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             if (i == 18) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(315,200 );
                try {
                sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

             if (i == 19) {
                interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));
                interfaz.tres.setLocation(450,200 );
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
