package com.mycompany.perifericabus;

/**
 *
 * @author kevda
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import java.awt.Graphics;
import java.awt.Image;


//import javax.swing.JButton;
//import javax.swing.JLabel; 
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;


public class interfaz extends JFrame {
    
    


    JButton detener1 = new JButton("Detener");
    JButton detener2 = new JButton("Detener");
    JButton detener3 = new JButton("Detener");
    JButton iniciar = new JButton("Iniciar");
    JButton detenerTodo = new JButton("Detener Todo");
    public static String img0= "Pista.jpg",   img1 = "carro1.jpg", img2 = "carro2.jpg", img3 = "carro3.jpg";

    public static JLabel cero = new JLabel();
    public static JLabel uno = new JLabel();
    public static JLabel dos = new JLabel();
    public static JLabel tres = new JLabel();
    JPanel controles = new JPanel();
    JPanel imagenes = new JPanel();
    //panelImage imagenes = new panelImage();
    
    
    //Imagen1 hilo1 = new Imagen1();
    //Imagen2 hilo2 = new Imagen2();
    //Imagen3 hilo3 = new Imagen3();
    int z = 0;


    
public interfaz(){
   


    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
   
    cero.setIcon(new ImageIcon(img0));
    uno.setIcon(new ImageIcon(img1));
    dos.setIcon(new ImageIcon(img2));
    tres.setIcon(new ImageIcon(img3));
    imagenes.setLayout(new FlowLayout());
    
    
    imagenes.add(uno);
    imagenes.add(dos);
    imagenes.add(tres);
        
    controles.setLayout(new GridLayout(2, 3));
    controles.add(detener1);
    controles.add(detener2);
    controles.add(detener3);
    controles.add(iniciar);
    controles.add(detenerTodo);
    imagenes.add(cero);

    add("Center", imagenes);
    add("South", controles);
    
    
    
//Controles
iniciar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt){
if(hilo1.isAlive() == false) {
            if (hilo2.isAlive() == false) {
                if (hilo3.isAlive() == false) {
                    hilo1 = new Imagen1();
                    hilo2 = new Imagen2();
                    hilo3 = new Imagen3();
                    hilo1.activo = true;
                    hilo2.activo = true;
                    hilo3.activo = true;
                    hilo1.start();
                    hilo2.start();
                    hilo3.start();
                    z = 1;
                }
            }
        }
    }
});

detenerTodo.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt){
if(z== 1) {
            hilo1.activo = false;
            hilo2.activo = false;
            hilo3.activo = false;
            if (hilo1.c == hilo2.c) {
                if (hilo2.c == hilo3.c) {
                    JOptionPane.showMessageDialog(Interfaz.this, " Ganador ! ! ! ");
                }
            }
        }
    }
});

detener1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt){
        hilo1.activo = false;
    }
});

detener2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt){
        hilo2.activo = false;
    }
});

detener3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt){
hilo3.activo=false;
}
});







}


}
