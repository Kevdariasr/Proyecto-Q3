package com.mycompany.perifericabus;
/**
 *
 * @author kevda
 */

public class PerifericaBus {

    
    
    public static void main(String[] args) {
        System.out.println("Iniciando!");
        
        // Esto sirve para inicial el jfame
        interfaz ventana = new interfaz();
        ventana.setSize(1000, 602);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Perifercia Bus");
        ventana.setVisible(true);
        
        
    }
    
    // Etan son las coordenadas que utilizan los buses
    public static class coordenadas {
        private boolean disponible = true;
        private int [][] coor = new int [31][2];
        public coordenadas (){
            coor [0][0] = 276;
            coor [0][1] = 354;
            coor [1][0] = 338;
            coor [1][1] = 385;
            coor [2][0] = 377;
            coor [2][1] = 325;
            coor [3][0] = 344;
            coor [3][1] = 276;
            coor [4][0] = 351;
            coor [4][1] = 235;
            coor [5][0] = 408;
            coor [5][1] = 237;
            coor [6][0] = 440;
            coor [6][1] = 190;
            coor [7][0] = 503;
            coor [7][1] = 211;
            coor [8][0] = 562;
            coor [8][1] = 194;
            coor [9][0] = 672;
            coor [9][1] = 178;
            coor [10][0] = 747;
            coor [10][1] = 133;
            coor [11][0] = 762;
            coor [11][1] = 191;
            coor [12][0] = 793;
            coor [12][1] = 213;
            coor [13][0] = 801;
            coor [13][1] = 245;
            coor [14][0] = 762;
            coor [14][1] = 275;
            coor [15][0] = 726;
            coor [15][1] = 298;
            coor [16][0] = 735;
            coor [16][1] = 362;
            coor [17][0] = 730;
            coor [17][1] = 422;
            coor [18][0] = 704;
            coor [18][1] = 464;
            coor [19][0] = 656;
            coor [19][1] = 457;
            coor [20][0] = 634;
            coor [20][1] = 487;
            coor [21][0] = 589;
            coor [21][1] = 480;
            coor [22][0] = 542;
            coor [22][1] = 466;
            coor [23][0] = 495;
            coor [23][1] = 466;
            coor [24][0] = 395;
            coor [24][1] = 472;
            coor [25][0] = 300;
            coor [25][1] = 465;
            coor [26][0] = 329;
            coor [26][1] = 413;
            coor [27][0] = 285;
            coor [27][1] = 404;
            coor [28][0] = 250;
            coor [28][1] = 393;
            coor [29][0] = 271;
            coor [29][1] = 355;
    }
    public int leer_coordenada(int x, int y){
            return coor[x][y];
    }
        
    }
    
    static class estacion {
        private boolean disponible = true;
        private int [][] esta = new int [9][1];
        public estacion (){
            esta [0][0] = 1;
            esta [0][1] = 0;
            esta [1][0] = 2;
            esta [1][1] = 0;
            esta [2][0] = 3;
            esta [2][1] = 0;
            esta [3][0] = 4;
            esta [3][1] = 0;
            esta [4][0] = 5;
            esta [4][1] = 0;
            esta [5][0] = 6;
            esta [5][1] = 0;
            esta [6][0] = 7;
            esta [6][1] = 0;
            esta [7][0] = 8;
            esta [7][1] = 0;
            esta [8][0] = 9;
            esta [8][1] = 0;
            esta [9][0] = 10;
            esta [9][1] = 0;
            
    }
    public int leer_estacion(int x, int y){
            return esta[x][y];
    }
    public int guardar_estacion(int x, int y,int valor){
            esta[x][y] = valor;
            return 0;
    }    
    }
}
