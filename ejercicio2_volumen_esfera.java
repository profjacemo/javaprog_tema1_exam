/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package exam_t1_java_20oct22_sols;

import java.util.Scanner;

public class ejercicio2_volumen_esfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner lectura = new Scanner(System.in);
        // el valor decimal de radio debe usar la coma para expresar la parte decimal en el cli
        System.out.println("Introduzca el radio de la esfera (expresado en cm):");
        float radio = lectura.nextFloat();
        float radio_cubo = radio*radio*radio;
        // expresar todo en flotante y no usar enteros, para que no reduzca precisión
        float volumen_esfera = (float)(4.0/3.0) * 3.14F * radio_cubo;
        if (radio<= 0)
        {
            System.out.println("Introduzca un radio válido (positivo)");
        }
        else
        {
            System.out.println("El volumen de la esfera es de: " + volumen_esfera + " cm^3");
        }
    }
}
