public class Ejercicio8
{
    public static void main(String[] args)
    {
        int m= 1000;
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
        //Imprimiría "ERROR: 1000 es muy grande"
    }
}
