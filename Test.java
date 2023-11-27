import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    static void fun1() {
        int a[][] = new int[5][5];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
            {
                count++;
                a[i][j] = count;
            }System.out.println(Arrays.toString(a[i]));
        }
    }
    public static void main(String[] args) {
        fun1();
    }
}