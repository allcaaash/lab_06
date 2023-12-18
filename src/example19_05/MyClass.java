package example19_05;

public class MyClass {
    public static int squaresSumCalculate(int num) {
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += (int) Math.pow(i, 2);
        }

        return result;
    }
}
