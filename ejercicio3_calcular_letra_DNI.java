/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package exam_t1_java_20oct22_sols;

import java.util.Scanner;

public class ejercicio3_calcular_letra_DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca su numero de DNI:");
        int numero_DNI = lectura.nextInt();
        int resto = numero_DNI%23;
        char[] letras_DNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        System.out.println("Tu letra del DNI es: " +letras_DNI[resto]);
    }
}
