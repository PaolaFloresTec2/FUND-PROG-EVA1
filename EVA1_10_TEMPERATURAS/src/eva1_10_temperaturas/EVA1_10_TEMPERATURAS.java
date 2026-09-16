/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperaturas;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA1_10_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp, far, kelvin;//variables (indentificadores válidos)
        Scanner captu = new Scanner(System.in);
        
        //SOLICITAR DATOS AL USUARIO
        System.out.println("Introduce la temperatura en Centigrados: ");
        temp = captu.nextDouble();
        
        //HACER EL CÁLCULO
        far = (temp *1.8) + 32;//grados
        kelvin = temp + 273.15;//kelvin
        
        //MOSTRAR RESULTADOS AL USUSARIO
        System.out.println(temp + "°C = " + far + "°F");
        System.out.println(temp + "°C = " + kelvin + "°K");
    }
    
}
