/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double t,a,e,d,p; int c; Scanner x = new Scanner(System.in);
       System.out.println("Tasa anual: "); t =x.nextDouble();
       System.out.println("Habitantes: "); d =x.nextDouble();
       
        c=0;
        System.out.println("Numero de años: "); e =x.nextDouble();
        a=d;
        while (c>=0 && c<=e){
            p=d*t;
            System.out.println("La poblacion del año "+c +" es de :  "+a +" billones de habitantes");
            a=a+p;
            
            c=c+1;}
    }
    
}
