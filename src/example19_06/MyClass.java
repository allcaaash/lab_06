package example19_06;

public class MyClass {
    public static int[] createNewArray(int[] array, int count) {
        if (count < array.length) {
            int[] newArray = new int[count];

            for (int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }
            return newArray;
        }
        else
            return array.clone();
    }
}
