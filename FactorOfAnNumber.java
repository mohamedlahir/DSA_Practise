import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorOfAnNumber {
    public static int kthFactor(int n, int k) {
        List<Integer> hello = new ArrayList<>();
        Integer count = 0;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                if (n / i != 0) {
                    int div = n / i;
                    hello.add(div);
                    count = hello.size();
                }
            }
        }
        if (k > count) {
//                  System.out.println("-1");
            return -1;
        } else {
            return hello.get(k - 1);

        }
    }

    public static void main(String[] args) {
        System.out.println(kthFactor(12,3));
    }
}

