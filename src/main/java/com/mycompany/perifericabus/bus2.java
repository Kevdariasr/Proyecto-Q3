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
                
                interfaz.uno.setLocation(320, 583);
                i++;
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) { }
                c ++;
            }
            if (i == 2) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(370, 600);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {            }
                i++;
                c ++;
            }
            if (i == 3) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(404, 600);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) { }
                i++;
                c ++;
            }
            
            if (i == 4) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(400, 628);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {             }
                i++;
                c ++;
            }            
            
            if (i == 5) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(436, 645);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
            
            if (i == 6) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(470, 621);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 7) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(512, 586);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 8) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(484, 464);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 9) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(428, 450);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 10) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(396, 428);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }


            if (i == 11) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(397, 408);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

            if (i == 12) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(421, 416);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

             if (i == 13) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(445, 430);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
            
             if (i == 14) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(300, 620);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             if (i == 15) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(15,200 );
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             if (i == 16) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(300, 620);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             
             if (i == 17) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(300, 620);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }
             
             if (i == 18) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(300, 620);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i++;
                c ++;
            }

             if (i == 19) {
                interfaz.dos.setIcon(new ImageIcon(interfaz.bus2));
                interfaz.dos.setLocation(300, 620);
                try {
                Thread.sleep(tiempo);
                } catch (InterruptedException e) {        }                
                i=2;
                c ++;
                
                if (c> 50 ) {
                    this.activo=false;
                }
                
            }
             
             
             
             
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
            }
    }
}
}
