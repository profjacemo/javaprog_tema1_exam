import java.util.Scanner;
public class ej_9_JMCC {
    public static void main(String args[]) 
    {
        Scanner lectura = new Scanner(System.in);
        String[] lenguajes = {"Java", "Python", "C++", "Haskell"};
        System.out.println("Que nivel de programacion crees que tienes en el lenguaje " + lenguajes[0]);
        float nota_Java = lectura.nextFloat();
        System.out.println("Que nivel de programacion crees que tienes en el lenguaje " + lenguajes[1]);
        float nota_Python = lectura.nextFloat();
        System.out.println("Que nivel de programacion crees que tienes en el lenguaje " + lenguajes[2]);
        float nota_C = lectura.nextFloat();
        System.out.println("Que nivel de programacion crees que tienes en el lenguaje " + lenguajes[3]);
        float nota_Haskell = lectura.nextFloat();
        float media = (nota_Java + nota_Python + nota_C + nota_Haskell)/4;
        System.out.println("La nota media de los cuatro lenguajes es: " + media);
    }
}
