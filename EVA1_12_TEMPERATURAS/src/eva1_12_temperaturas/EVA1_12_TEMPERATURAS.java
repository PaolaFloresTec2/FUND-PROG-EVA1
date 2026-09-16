/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperaturas;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA1_12_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DE KELVIN A CELSIUS
        //DE KELVIN A FAHRENHEIT
        double kelvin, far, celsius;//variables (indentificadores válidos)
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce la temperatura en Kelvin: ");
        kelvin = captu.nextDouble();
        
        celsius = (kelvin - 273.15);//AQUI SI IMPORTA EL PARENTESIS
        far = (kelvin - 273.15) * (9 / 5.0) + 32;
        System.out.println(kelvin + "°K = " + celsius + "°C");
        System.out.println(kelvin + "°K = " + far + "°F");
    }
    
}
