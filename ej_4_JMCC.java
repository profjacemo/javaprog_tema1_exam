import java.util.Scanner;
public class ej_4_JMCC 
{
    public static void main(String args[]) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Cual fue su nota en el tema 1:");
        float tema1 = lectura.nextFloat();
        float media_tema1 = tema1 >= 5 ? tema1:0;
        System.out.println("Cual fue su nota en el tema 2:");
        float tema2 = lectura.nextFloat();
        float media_tema2 = tema2 >= 5 ? tema2:0;
        System.out.println("Cual fue su nota en el tema 3:");
        float tema3 = lectura.nextFloat();
        float media_tema3 = tema3 >= 5 ? tema3:0;
        int media_total = (int)((media_tema1 + media_tema2 + media_tema3)/3); 
        if(media_tema1 == 0 || media_tema2 == 0 || media_tema3 == 0)
        {
            System.out.println("Este alumno esta suspenso");
        }
        else
        {
            System.out.println("Este alumno esta aprobado");
            System.out.println("Ademas, tiene una media de: " +media_total);
        }
        
    }
}
