import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    String printRes;

    @Before
    public void setUp() {
        printRes = FizzBuzz.print();
    }

    @Test
    public void shouldPrintNumber() {
        assertThat( printRes, containsString("1"));
        assertThat( printRes, containsString("98"));
    }

    @Test
    public void shouldPrintFizzForMulitpleOfThree() {
        assertThat( printRes, containsString("fizz"));
    }

    @Test
    public void shouldPrintBuzzForMultiplesOfFive() {
        assertThat( printRes, containsString("buzz"));

    }

    @Test
    public void shouldPrintFizzBuzzForMulitplesOfThreeAndFive() {
        assertThat( FizzBuzz.print(), containsString("fizzbuzz"));

    }
}
