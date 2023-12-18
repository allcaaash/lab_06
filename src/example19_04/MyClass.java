package example19_04;

public class MyClass {
    public static int calculateDoubleFactorial(int iter) {
        int result = 1;
        while (iter > 0) {
            result *= iter;
            iter -= 2;
        }

        return result;
    }
}
