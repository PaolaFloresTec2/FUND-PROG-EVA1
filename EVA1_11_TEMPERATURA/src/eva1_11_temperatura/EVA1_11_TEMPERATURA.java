/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA1_11_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double far, celsius, kelvin;//variables (indentificadores válidos)
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce la temperatura en Fahrenheit: ");
        far = captu.nextDouble();
        
        celsius = (far - 32) / 1.8;//AQUI SI IMPORTA EL PARENTESIS
        kelvin = (far - 32) * (5 / 9.0) + 273.15;//ojo: 5 / 9 DA CERO, 5 / 9 DA 0.5
        System.out.println(far + "°F = " + celsius + "°C");
        System.out.println(far + "°F = " + kelvin + "°K");
    }
    
}
