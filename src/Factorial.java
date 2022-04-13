public class Factorial {

    public static int factorial(int integer) {

        int factor = 1;

        for (int i = 2; i <= integer; i++) {

            factor = factor * i;

        }

        return factor;

    }

}
