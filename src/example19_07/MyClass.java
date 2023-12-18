package example19_07;

public class MyClass {
    public static int[] encodeArray(char[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) array[i];
        }

        return newArray;
    }
}
