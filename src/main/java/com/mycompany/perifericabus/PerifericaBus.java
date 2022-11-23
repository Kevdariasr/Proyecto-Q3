package com.mycompany.perifericabus;

/**
 *
 * @author kevda
 */
public class PerifericaBus {

    public static void main(String[] args) {
        System.out.println("Iniciando!");
        
        
        interfaz ventana = new interfaz();
        ventana.setSize(1570, 950);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Perifercia Bus");
        ventana.setVisible(true);
        


        
    }
}
