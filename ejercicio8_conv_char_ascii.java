
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package exam_t1_java_20oct22_sols;

public class ejercicio8_conv_char_ascii {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca el número y le dire su código ASCII equivalente: ");  
        int numero = input.nextInt(); 
        char simboloascii = (char) numero;
        System.out.println("Su simbolo ASCII es: " + simboloascii);  
    }
}
