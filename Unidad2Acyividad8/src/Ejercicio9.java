public class Ejercicio9
{
    public static void main(String[] args)
    {
        int m= 50;
        try
        {
            System.out.println("Entrando en el try");
            if (m > 100)
            {
                throw new Exception(m + " es muy grande");
            }
            System.out.println("Saliendo del bucle try");
        }
        catch (Exception e)
        {
            System.out.println("ERROR: " +e.getMessage());
        }
        //"Entrando en el try" y "Saliendo del try"
        //Porque no entra en Exception ni en el catch
    }
}
