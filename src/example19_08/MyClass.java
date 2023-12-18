package example19_08;

public class MyClass {
    public static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum/array.length;
    }
}
