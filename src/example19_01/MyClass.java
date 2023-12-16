package example19_01;

public class MyClass {
    private char symbol;
    private String line;

    public void setValue(char symbol) {
        this.symbol = symbol;
    }

    public void setValue(String line) {
        this.line = line;
    }
    public void setValue(char[] array) {
        if (array.length == 1) {
            this.symbol = array[0];
        }
        else if (array.length > 1) {
            this.line = String.valueOf(array);
        }
    }

    public char getSymbol() {
        return symbol;
    }

    public String getLine() {
        return line;
    }
}
