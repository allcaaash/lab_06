package example19_04;

public class MainClass {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        System.out.printf("%s!! = %s\n", num1, MyClass.calculateDoubleFactorial(num1));
        System.out.printf("%s!! = %s\n", num2, MyClass.calculateDoubleFactorial(num2));
    }
}
