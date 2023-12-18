package example19_10;

public class MyClass {
    public static int[] getMinAndMax(int ... args) {
        int[] result = {args[0], args[0]};
        for (int i = 0; i < args.length; i++) {
            if (args[i] < result[0])
                result[0] = args[i];
            else if (args[i] > result[1])
                result[1] = args[i];
        }

        return result;
    }
}
