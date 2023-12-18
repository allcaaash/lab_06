package example19_07;

public class MainClass {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'A', 'B', 'C', '!', '@', '#', '1', '2', '3'};
        int [] newArray = MyClass.encodeArray(array);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
