
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package exam_t1_java_20oct22_sols;

public class ejercicio5_calculo_am_pm {

    public static void main(String args[]) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca la hora del dia en formato entero(de 0 a 24):");
        int hora = lectura.nextInt();
        String mediodia = (hora<=12) ? "Es antes de mediodia": "Es después de mediodia";
        System.out.println(mediodia);
    }
}
