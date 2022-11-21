/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package exam_t1_java_20oct22_sols;

public class ejercicio6_tabla_verdad {
    public static void main(String args[]) {
        boolean A = true;
        boolean B = true;
        System.out.println("La tabla de verdad de la función resulta:");
        System.out.print("Si A = true y B = true --> ");
        System.out.println((A && !B) || (!(B && A)));
        A = false;
        B = false;
        System.out.print("Si A = false y B = false --> ");
        System.out.println((A && !B) || (!(B && A)));
        A = true;
        B = false;
        System.out.print("Si A = true y B = false --> ");
        System.out.println((A && !B) || (!(B && A)));
        A = false;
        B = true;
        System.out.print("Si A = false y B = true --> ");
        System.out.println((A && !B) || (!(B && A)));
    }
}
