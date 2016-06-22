import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.Is.is;

public class PrimeTest {
    @Test
    public void shouldGetAllFactorsOfInput() {
        List<Integer> factors = Prime.factors(1);
        assertThat(factors, contains(1));

        factors = Prime.factors(2);
        assertThat(factors, contains(1, 2));

        factors = Prime.factors(3);
        assertThat(factors, contains(1, 3));

        factors = Prime.factors(15);
        assertThat(factors, contains(1, 3, 5, 15));

    }

    @Test
    public void shouldCheckPrime() {
        assertThat(Prime.isPrime(1), is(false));
        assertThat(Prime.isPrime(2), is(true));
        assertThat(Prime.isPrime(4), is(false));
        assertThat(Prime.isPrime(19), is(true));
        assertThat(Prime.isPrime(99), is(false));
    }

    @Test
    public void shouldGetAllPrimeFactorsOfInput() {
        List<Integer> primeFactors = Prime.primeFactors(1);
        assertThat(primeFactors.size(), is(0));

        primeFactors = Prime.primeFactors(2);
        assertThat(primeFactors, contains(2));

        primeFactors = Prime.primeFactors(8);
        assertThat(primeFactors, contains(2));

    }
}
