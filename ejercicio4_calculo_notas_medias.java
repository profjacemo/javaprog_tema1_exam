/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package exam_t1_java_20oct22_sols;

import java.util.Scanner;

public class ejercicio4_calculo_notas_medias {
    public static void main(String args[]) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("¿Cuál fue su nota en el tema 1 ?:");
        float tema1 = lectura.nextFloat();
        float media_tema1 = tema1 >= 5 ? tema1:0;
        System.out.println("¿Cuál fue su nota en el tema 2 ?:");
        float tema2 = lectura.nextFloat();
        float media_tema2 = tema2 >= 5 ? tema2:0;
        System.out.println("¿Cuál fue su nota en el tema 3 ?:");
        float tema3 = lectura.nextFloat();
        float media_tema3 = tema3 >= 5 ? tema3:0;
        int media_total = (int)((media_tema1 + media_tema2 + media_tema3)/3.0); 
        if(media_tema1 == 0 || media_tema2 == 0 || media_tema3 == 0)
        {
            System.out.println("Este alumno está suspenso");
        }
        else
        {
            System.out.println("Este alumno está aprobado");
            System.out.println("Su nota media es de: " +media_total);
        }
    }
}
