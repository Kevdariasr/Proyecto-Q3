/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.perifericabus;

/**
 *
 * @author kevda
 */
public class PerifericaBus {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Interfaz ventana = new Interfaz();
        ventana.setSize(  700, 800);
        //ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Pista Carros");
        ventana.setVisible(true);
                
    }
}