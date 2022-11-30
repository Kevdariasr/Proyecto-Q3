package com.mycompany.perifericabus;
import com.mycompany.perifericabus.PerifericaBus.coordenadas;
import javax.swing.*;
    import java.util.Random;
    import javax.swing.ImageIcon;

/**
 *
 * @author kevda
 */

public class bus1 extends Thread{
    private coordenadas lascoordenadas;
    boolean activo = true;
    Random bus = new Random();
    Random tiem = new Random();
    int i = 0;
    int tiempo = 1000;
    int c = 0;
    

    public void imprimir(int x,int y){
     
        interfaz.uno.setIcon(new ImageIcon(interfaz.bus1));

        interfaz.uno.setLocation(x,y);//punto de inicio

         try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
        }
    }
@Override
    public void run() {
        
        while (activo == true) {
            tiempo = tiem.nextInt(750);
            int x;
            int y;
            coordenadas lascoordenadas = new coordenadas();
            for (int i = 0; i<31; i++){
                x = lascoordenadas.leer_coordenada(i,0);
                y = lascoordenadas.leer_coordenada(i,1);
                imprimir(x,y); 


            }
        }   
    }
}
