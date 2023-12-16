package example19_01;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.setValue('%');
        System.out.println(obj.getSymbol());

        obj.setValue("Hello Wold");
        System.out.println(obj.getLine());

        char[] array = {'H', 'e', 'l','l','o',' ','a','r','r','a','y','!'};
        obj.setValue(array);
        System.out.println(obj.getLine());
    }
}
