package exc;

public class MathUtils {
    //a
    public static double power(int a, int b) {
        return Math.pow(a, b);
    }

    //b
    public static double factorial(int a) {
        double product = 1;
        for (int i = 0; i <= a; i++) {
            product *= i;
        }
        return product;
    }
}
