package com.mycompany.perifericabus.Buses;
import com.mycompany.perifericabus.PerifericaBus;
import com.mycompany.perifericabus.interfaz;
import java.util.Random;
import javax.swing.ImageIcon;
/**
 *
 * @author kevda
 */

public class bus3 extends Thread {
    public boolean activo = true;
    Random bus = new Random();
    Random tiem = new Random();
    int tiempo = 3000;
    
    public void imprimir(int x,int y){
        // Aqui se llama la imagen del bus 
        interfaz.tres.setIcon(new ImageIcon(interfaz.bus3));

        interfaz.tres.setLocation(x,y);//puntos de inicio

         try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
        }
    }
@Override
    public void run() {
        // Aqui se llaman las coordenadas del main 
        while (activo == true) {
            tiempo = tiem.nextInt(750);
            int x;
            int y;
            PerifericaBus.coordenadas lascoordenadas = new PerifericaBus.coordenadas();
            for (int i = 0; i<31; i++){
                x = lascoordenadas.leer_coordenada(i,0);
                y = lascoordenadas.leer_coordenada(i,1);
                imprimir(x,y); 


            }
        }   
    }
}
