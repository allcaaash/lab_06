package example19_10;
public class MainClass {
    public static void main(String[] args) {
        int[] array = MyClass.getMinAndMax(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
