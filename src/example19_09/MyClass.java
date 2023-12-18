package example19_09;

public class MyClass {
    public static int[] replace(int[] array) {
        int length = array.length - 1;
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[length - i];
            array[length - i] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
