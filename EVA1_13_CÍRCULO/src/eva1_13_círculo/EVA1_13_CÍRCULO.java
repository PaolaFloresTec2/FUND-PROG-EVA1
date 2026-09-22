/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_círculo;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA1_13_CÍRCULO {
    static final double PI = 3.1416; //VARIABLE
    static final String MENSAJE = "Radio";
    
    public static void main(String[] args) {
    double rad, area, perim, volumen;
    Scanner captu = new Scanner(System.in);
    
    System.out.println("Radio: ");
    rad = captu.nextDouble();
    
    area = (3.1416 * (rad * rad));
    perim = (2 * 3.1416 * rad);
    volumen = (4 / 3.0) * 3.1416 * (rad * rad * rad);
    System.out.println("Área = " + area);
    System.out.println("Perímetro = " + perim);
    System.out.println("Volumen = " + volumen); 
    //CONSTANTE: es un identificador que no cambia de valor
    
    
    
    area = Math.pow(rad, 2) * Math.PI;
    perim = (2 * Math.PI * rad);
    volumen = (4 / 3.0) * Math.PI * Math.pow(rad, 3);
    System.out.println("Área = " + area);
    System.out.println("Perímetro = " + perim);
    System.out.println("Volumen = " + volumen); 
    }
    
}
