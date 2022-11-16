package com.mycompany.perifericabus;

/**
 *
 * @author kevda
 */
public class PerifericaBus {

    public static void main(String[] args) {
        System.out.println("Iniciando!");
        
        
        interfaz ventana = new interfaz();
        ventana.setSize(  700, 800);
        //ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Pista Carros");
        ventana.setVisible(true);
                
    }
}
