public class Ejercicio3
{
    public static void main(String[] args)
    {
        try {
            double d = Math.random();
            if (d > 0.95)
                throw new ArithmeticException(d + " está fuera de rango") ;
            System.out.println("El número es " + d);
            double j = Math.random();
            if (j > 0.5)
                throw new ArithmeticException(j + " está fuera de rango") ;
            System.out.println("El número es " + j);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        //Imprime "0.98 está fuera del rango".
        //En la segunda imprimiría "El número es 0.44"
    }
}
