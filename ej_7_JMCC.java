import java.util.Scanner;
public class ej_7_JMCC 
{

    
    public static void main(String args[]) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el numero 1:");
        int n1 = lectura.nextInt();
        System.out.println("Introduzca el numero 2:");
        int n2 = lectura.nextInt();
        System.out.println("Introduzca el numero 3:");
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
