import java.util.Scanner;

public class Ejercicio10
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        try
        {
            System.out.println("Introduce un valor: ");
                int num= sc.nextInt();
            if (num < 0)
            {
                throw new Exception("valor negativo en la coordenada " + num);
            }
            System.out.println("El valor es " + num);
        }
        catch (Exception e)
        {
            System.out.println("ERROR: " +e.getMessage());
        }
    }
}
