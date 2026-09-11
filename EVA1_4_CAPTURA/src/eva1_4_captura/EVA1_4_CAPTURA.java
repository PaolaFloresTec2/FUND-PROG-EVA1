/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA1_4_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SI VAMOS A USAR VARIABLES, SE TIENEN QUE "DECLARAR" ANTES DE USAR
        //DECLARAR --> CREAR LA VARIABLE PARA SU USO EN EL PROGRAMAA
        //TIPO_DATO NOMBRE_INDENTIFICADOR;
        //USAR NOMBRES SIGNIFICATIVOS --> DEBE DECIR PARA QUE SE USA
        String nombre;//declaración de la varable
        //ENTRADA DE DATOS DEL TECLADO (JAVA)
        Scanner captu = new Scanner(System.in); //otr variable --> captu de tipo Scanner
        
        System.out.println("Captura el nombre");
        
        // VARIABLES CREARLAS --> DECLARAR LA VARIABLE, ASIGNAR UN TIPO DE DATO
        // PONERLE NOMBRE A LA VARIABLE
        // capturar del teclado ponerlo en la variable nombre
        //escribir en la variable (poner un valor) ASIGNACIÓN
        nombre = captu.nextLine();
        System.out.println("El valor capturado es");
        System.out.println (nombre);//USO LA VARIABLE --> LECTURA
    }
    
}
