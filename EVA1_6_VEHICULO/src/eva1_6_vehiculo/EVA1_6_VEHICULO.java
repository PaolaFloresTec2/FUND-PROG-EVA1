/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        String marca;
        String modelo;
        int año;
        String color;
        int kilometraje;
        double precio;
        //SCANNER
        Scanner captu = new Scanner(System.in);
         // CAPTURA
        System.out.println("Captura el auto");
        marca = captu.nextLine(); //LEE EL TEXTO EN ENTER
        System.out.println("Captura el modelo");
        modelo = captu.nextLine();
        System.out.println("Captura el año");
        año = captu.nextInt();
        System.out.println("Captura el color");
        color = captu.nextLine();
        System.out.println("Captura el kilometraje");
        kilometraje = captu.nextInt();
        System.out.println("Captura el precio");
        precio = captu.nextDouble();
        System.out.println("DATOS CAPTURADOS");
        System.out.print("Marca del vehiculo: ");
        System.out.println(marca);
        System.out.print("Modelo del vehiculo: ");
        System.out.println(modelo);
        System.out.print("Año del vehiculo: ");
        System.out.println(año);
        System.out.print("Color del vehiculo: ");
        System.out.println(color);
        System.out.print("Kilometraje del vehiculo: ");
        System.out.println(kilometraje);
        System.out.print("Precio del vehiculo: ");
        System.out.println(precio);
    }
    
}
