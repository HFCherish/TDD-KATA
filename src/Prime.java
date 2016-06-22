import java.util.ArrayList;
import java.util.List;

public class Prime {
    @Deprecated
    public static List<Integer> factors(int input) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= input; i++) {
            if (input % i == 0)
                res.add(i);
        }
        return res;
    }

    @Deprecated
    public static boolean isPrime(int input) {
        if (input == 2) return true;
        if (input == 1 || input % 2 == 0) return false;
        for (int i = 3; i < input; i += 2) {
            if (input % i == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> primeFactors(int input) {
        List<Integer> res = new ArrayList<>();
        int startPrime = 2;
        for (; input > 1; startPrime++) {
            for (; input % startPrime == 0; input /= startPrime) {
                res.add(startPrime);
            }
        }
        return res;
    }
}
