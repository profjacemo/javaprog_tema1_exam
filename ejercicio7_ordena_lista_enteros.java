
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package exam_t1_java_20oct22_sols;

public class ejercicio7_ordena_lista_enteros {
    public static void main(String args[]) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el número 1:");
        int n1 = lectura.nextInt();
        System.out.println("Introduzca el número 2:");
        int n2 = lectura.nextInt();
        System.out.println("Introduzca el número 3:");
        int n3 = lectura.nextInt();
        int[] posicion = {n1, n2, n3};
        if (n1>n2) 
        {
            if (n1 > n3)
            {
                if (n2 > n3)
                {
                    posicion[0] = n3;
                    posicion[1] = n2;
                    posicion[2] = n1;
                }
                else 
                {
                    posicion[0] = n2;
                    posicion[1] = n3;
                    posicion[2] = n1;
                }
            }
            else 
            {
                posicion[0] = n2;
                posicion[1] = n1;
                posicion[2] = n3;
            }
        }
        else
        {
            if (n1 > n3)
            {
                posicion[0] = n3;
                posicion[1] = n1;
                posicion[2] = n2;
            }
            else
            {
                if (n2 > n3)
                {
                    posicion[0] = n1;
                    posicion[1] = n3;
                    posicion[2] = n2;
                }
            }
        } 
        System.out.println("La lista ordenada es: {" + posicion[0] + ", " + posicion[1] + ", " + posicion[2] +"}");     
    }
}
