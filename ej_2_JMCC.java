import java.util.Scanner;
public class ej_2_JMCC 
{

    
    public static void main(String args[]) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el radio de la esfera (expresado en cm):");
        float radio = lectura.nextFloat();
        float radio_cubo = radio*radio*radio;
        float volumen_esfera = (float)4/3 * 3.14F * radio_cubo;
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
