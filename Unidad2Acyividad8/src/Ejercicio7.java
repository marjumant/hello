public class Ejercicio7
{
    public static void main(String[] args)
    {
        int i;
        for (int k= 0; k < 5; k++)
        {
            try
            {
                throw new ArithmeticException("El resultado es: " + 100/k);

            }
            catch (ArithmeticException e)
            {
            System.out.println(e.getMessage());
            }
        }
    }
}
