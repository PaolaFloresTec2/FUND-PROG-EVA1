/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author paola
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EL TIPO DE DATO DETERMINA LAS OPERACIONES
        //ENTEROS, REALES, CADENAS, LOGICOS, ETC
        //EXPRESIÓN:
        //VALORES
        //VARIABLES
        //OPERADORES
        //FUNCIONES
        //QUE SE EVALUAN PARA OBTENER UN RESULTADO
        //OPERACIONES CON NÚMEROS:
        //ARITMÉTICAS:
        int suma, val1, val2; //declaro 3 variables del  mismo tipo
        //ASIGNACIÓN; PONER UN VALOR EN UNA VARIABLE
        //operador --> símbolo que trabaja SOBRE indentificadores.
        // --------> asignación --> poner el valor
        // --------> comparación
        val1 = 100;  //asignar el valor de 100 a la variable val1
        val2 = 50;
        suma = val1 + val2; //expresión, asignar a la variable suma la operación entre val1 y val2
        //+ --> esta entre dos enteros, se interpreta como que los debe sumar
        System.out.print("val1 = ");
        System.out.println(val1);
         System.out.print("val2 = ");
        System.out.println(val2);
         System.out.print("suma = ");
        System.out.println(suma);
        //OPERACIONES RESPTEAN REGLAS MATEMÁTICAS
        //MULTIPLICACIÓN
        //*
        int multi;
        multi = val1 * val2;
        System.out.print("Multiplicación = ");
        System.out.println(multi);
        //división
        //    / --> operador de división
        int divi;
        divi = val1 / val2;
        System.out.print("División = ");
        System.out.println(divi);
        val1 = 10;
        val2 = 3;
        divi = val1 / val2;
        System.out.print("val1 = ");
        System.out.println(val1);
        System.out.print("val2 = ");
        System.out.println(val2);
         System.out.print("División = ");
        System.out.println(divi);
        double resu;
        resu = val1 / val2;
        System.out.print("Resu = ");
        System.out.println(resu);
        double val2copia;
        val2copia = 3;
        resu = val1 / val2copia;
         System.out.print("Resu = ");
        System.out.println(resu);
    }
    
}
