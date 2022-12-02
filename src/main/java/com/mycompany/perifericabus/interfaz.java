package com.mycompany.perifericabus;
/**
 *
 * @author kevda
 */
import com.mycompany.perifericabus.Buses.bus1;
import com.mycompany.perifericabus.Buses.bus3;
import com.mycompany.perifericabus.Buses.bus2;
import com.mycompany.perifericabus.Buses.bus4;
import com.mycompany.perifericabus.Buses.bus5;
import com.mycompany.perifericabus.Buses.bus6;
import com.mycompany.perifericabus.Buses.bus7;
import com.mycompany.perifericabus.Buses.bus8;
import com.mycompany.perifericabus.Buses.bus9;
import com.mycompany.perifericabus.Buses.bus10;
import com.mycompany.perifericabus.Buses.bus3;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;


public class interfaz extends JFrame {
    
    // Se determinan los botones a utilizar y los string para las imagenes 
    // Se crean los botones
    JButton iniciar = new JButton("Iniciar");
    JButton detenerTodo = new JButton("Detener Todo");
    
    public static String Mapa= "Mapa.jpg",bus1 = "bus1.jpg", bus2 = "bus2.jpg", bus3 = "bus3.jpg",bus4 ="bus4.jpg";
    public static String bus5 = "bus5.jpg",bus6 = "bus6.jpg",bus7="bus7.jpg",bus8="bus8.jpg", bus9="bus9.jpg",bus10="bus10.jpg" ;
    
    // se agregan los JLabel donde se pegan las imagenes 
    public static JLabel cero = new JLabel();
    public static JLabel uno = new JLabel();    
    public static JLabel dos = new JLabel();    
    public static JLabel tres = new JLabel();    
    public static JLabel cuatro = new JLabel();    
    public static JLabel cinco = new JLabel();   
    public static JLabel seis = new JLabel();    
    public static JLabel siete = new JLabel();   
    public static JLabel ocho = new JLabel();    
    public static JLabel nueve = new JLabel();
    public static JLabel diez = new JLabel();
    
    
    // Se agregan los controles y imagenes al JPanel
    JPanel controles = new JPanel();
    JPanel imagenes = new JPanel();
    //panelImage imagenes = new panelImage();
    
    // Se crean los Hilos
    bus1 hilo1 = new bus1();
    bus2 hilo2 = new bus2();
    bus3 hilo3 = new bus3();
    bus4 hilo4 = new bus4();
    bus5 hilo5 = new bus5();
    bus6 hilo6 = new bus6();
    bus7 hilo7 = new bus7();
    bus8 hilo8 = new bus8();
    bus9 hilo9 = new bus9();
    bus10 hilo10 = new bus10();
    int z = 0;

        
    
public interfaz(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    // se agregan el mapa y los buses
    cero.setIcon(new ImageIcon(Mapa));
    uno.setIcon(new ImageIcon(bus1));
    uno.setLocation(10,10);
    dos.setIcon(new ImageIcon(bus2));
    dos.setLocation(10,40);
    tres.setIcon(new ImageIcon(bus3));
    tres.setLocation(10,70);
    cuatro.setIcon(new ImageIcon(bus4));
    cuatro.setLocation(10,100);
    cinco.setIcon(new ImageIcon(bus5));
    cinco.setLocation(10,130);
    seis.setIcon(new ImageIcon(bus6));
    seis.setLocation(10,160);
    siete.setIcon(new ImageIcon(bus7));
    siete.setLocation(10,190);
    ocho.setIcon(new ImageIcon(bus8));
    ocho.setLocation(10,220);
    nueve.setIcon(new ImageIcon(bus9));
    nueve.setLocation(10,250);
    diez.setIcon(new ImageIcon(bus10));
    diez.setLocation(10,280);
    imagenes.setLayout(new FlowLayout());
    
    //agrega imagenes al frame
    imagenes.add(uno);
    imagenes.add(dos);
    imagenes.add(tres);
    imagenes.add(cuatro);
    imagenes.add(cinco);
    imagenes.add(seis);
    imagenes.add(siete);
    imagenes.add(ocho);
    imagenes.add(nueve);
    imagenes.add(diez);
    
    // Se agregan los controles
    controles.setLayout(new GridLayout(1, 1));
    controles.add(iniciar);
    controles.add(detenerTodo);
    // No mover deja la imagen del mapa atras (tiene un orden logico de arriba hacia abajo)
    imagenes.add(cero);
    
    //Se agregan los botones
    add("Center", imagenes);
    add("South", controles);
    
    
    
//Controles

iniciar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt){
if(hilo1.isAlive() == false) {
            if (hilo2.isAlive() == false) {
                if (hilo3.isAlive() == false) {
                    
                    hilo1.activo = true;
                    hilo2.activo = true;
                    hilo3.activo = true;
                    hilo4.activo = true;
                    hilo5.activo = true;
                    hilo6.activo = true;
                    hilo7.activo = true;
                    hilo8.activo = true;
                    hilo9.activo = true;
                    hilo10.activo = true;
                    
                    hilo1.start();
                    hilo2.start();
                    hilo3.start();
                    hilo4.start();
                    hilo5.start();
                    hilo6.start();
                    hilo7.start();
                    hilo8.start();
                    hilo9.start();
                    hilo10.start();
                    
                }
            }
        }
    }
});

detenerTodo.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent evt){
    hilo1.activo = false;
    hilo2.activo = false;
    hilo3.activo = false;
    hilo4.activo = false;
    hilo5.activo = false;
    hilo6.activo = false;
    hilo7.activo = false;
    hilo8.activo = false;
    hilo9.activo = false;
    hilo10.activo = false;

    }
});
    

}


}
