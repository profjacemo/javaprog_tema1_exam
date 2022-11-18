import java.util.Scanner;
public class ej_5_JMCC 
{
    public static void main(String args[]) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca la hora del dia en formato entero(de 0 a 24):");
        int hora = lectura.nextInt();
        String mediodia = (hora<=12) ? "Es mediodia": "Es despues de mediodia";
        System.out.println(mediodia);
    }
}
