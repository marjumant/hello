import java.util.Scanner;

public class Ejercicio11
{
    public static void main(String[] args)
    {
        boolean correcto= false;

        Scanner sc= new Scanner(System.in);

        do
        {
            System.out.println("Introduzca un valor entero: ");

            try
            {
                int num= sc.nextInt();

                correcto= true;
            }
            catch (ImputMismatchException e)
            {
                System.out.println("No has introducido un número.");
                sc.next
            }
        }
    }
}
