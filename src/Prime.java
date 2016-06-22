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

    public static String printPrimeComposite(int start, int end) {
        StringBuilder res = new StringBuilder();
        for(int i=start; i<=end; i++) {
            if( i == 1 )    res.append(1);
            else {
                int factor;
                for (factor = 2; factor < i && i % factor != 0; factor++) ;
                if (factor >= i) res.append("prime");
                else if( i % 2 == 0 )   res.append(i);
                else res.append("composite");
            }
            res.append(", ");
        }
        return res.substring(0, res.length()-2);
    }
}
