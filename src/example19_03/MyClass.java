package example19_03;

public class MyClass {
    public static int getMaxValue(int ... args) {
        int result = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] > result)
                result = args[i];
        }

        return result;
    }

    public static int getMinValue(int ... args) {
        int result = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < result)
                result = args[i];
        }

        return result;
    }

    public static double getAverageValue(int ... args) {
        int result = 0;
        for (int num : args) {
            result += num;
        }

        return (double) result/args.length;
    }
}
