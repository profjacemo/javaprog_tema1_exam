
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//package exam_t1_java_20oct22_sols;

public class ejercicio9_lista_notas_prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         Scanner leer = new Scanner (System.in);
        

        String [] lengprog = {"Php", "Java", "C++", "HTML"};


        System.out.println("Qué nivel tienes en el lenguaje Php? ");
        int php = leer.nextInt();       
        System.out.println("Qué nivel tienes en el lenguaje Java? ");
        int java = leer.nextInt();
        System.out.println("Qué nivel tienes en el lenguaje C++? ");
        int c = leer.nextInt();
        System.out.println("Qué nivel tienes en el lenguaje HTML? ");
        int html = leer.nextInt();
        
        int [] Lista= {php, java, c, html};
        int Media = (int) ( (Lista[0]+Lista[1]+Lista[2]+Lista[3])/4.0 );
        
        System.out.println("La not media redondeada es " + Media);
    }
}
