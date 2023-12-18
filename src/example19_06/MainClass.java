package example19_06;

public class MainClass {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] newArray = MyClass.createNewArray(array, 5);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        int[] newArray2 = MyClass.createNewArray(array, 20);
        for (int i = 0; i < newArray2.length; i++) {
            System.out.print(newArray2[i] + " ");
        }
    }
}
