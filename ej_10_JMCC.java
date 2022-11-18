import java.util.Scanner;
public class ej_10_JMCC 
{
    public static void main(String args[]) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("De que numero deseas saber la tabla de multiplicar:");
        byte numero = lectura.nextByte();
        System.out.println("La tabla de multiplicar de " + numero + " es la siguiente:");
        System.out.println(numero + " x 0 = " + numero *0);
        System.out.println(numero + " x 1 = " + numero *1);
        System.out.println(numero + " x 2 = " + numero *2);
        System.out.println(numero + " x 3 = " + numero *3);
        System.out.println(numero + " x 4 = " + numero *4);
        System.out.println(numero + " x 5 = " + numero *5);
        System.out.println(numero + " x 6 = " + numero *6);
        System.out.println(numero + " x 7 = " + numero *7);
        System.out.println(numero + " x 8 = " + numero *8);
        System.out.println(numero + " x 9 = " + numero *9);
        System.out.println(numero + " x 10 = " + numero *10);
/*      Otra forma de hacerlo más eficiente 
        for(int i = 0; i<=10; i++)
        {
            System.out.println(numero + " x " + i + " = " + numero * i); 
        } */
        
    }
}
