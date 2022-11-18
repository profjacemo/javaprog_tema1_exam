
public class ej_6_JMCC 
{
    public static void main(String args[]) 
    {
        boolean A = true;
        boolean B = true;
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
