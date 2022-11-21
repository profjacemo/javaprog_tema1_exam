/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package exam_t1_java_20oct22_sols;

import java.util.Scanner;

public class ejercicio10_tabla_multiplicar_byte {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("De qué número entre (-128 y 127) desea obtener la tabla de multiplicar?");
        byte num = leer.nextByte();  
        
        int pos0 = num*0;
        int pos1 = num*1;
        int pos2 = num*2;
        int pos3 = num*3;
        int pos4 = num*4;
        int pos5 = num*5;
        int pos6 = num*6;
        int pos7 = num*7;
        int pos8 = num*8;
        int pos9 = num*9;
        int pos10 = num*10;
        
        System.out.println("Su tabla de multiplicar es:");
        System.out.println(num + "x0:" + pos0);
        System.out.println(num + "x1:" + pos1);
        System.out.println(num + "x2:" + pos2);
        System.out.println(num + "x3:" + pos3);
        System.out.println(num + "x4:" + pos4);
        System.out.println(num + "x5:" + pos5);
        System.out.println(num + "x6:" + pos6);
        System.out.println(num + "x7:" + pos7);
        System.out.println(num + "x8:" + pos8);
        System.out.println(num + "x9:" + pos9);
        System.out.println(num + "x10:" + pos10);
    }
}
