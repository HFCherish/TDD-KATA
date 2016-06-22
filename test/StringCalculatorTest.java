import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringCalculatorTest {

    @Test
    public void shouldReturn0GivenEmptyString() {
        assertThat(StringCalculator.calculate(""), is(0));
        assertThat(StringCalculator.calculate(null), is(0));
    }

    @Test
    public void shouldReturnNumberGivenOneNumberString() {
        assertThat(StringCalculator.calculate("1"), is(1));
        assertThat(StringCalculator.calculate("-1"), is(-1));
        assertThat(StringCalculator.calculate("123"), is(123));

    }

    @Test
    public void shouldReturnSumGivenTwoNumbers() {
        assertThat(StringCalculator.calculate("1,2"), is(3));
        assertThat(StringCalculator.calculate("-1,-2"), is(-3));
        assertThat(StringCalculator.calculate("123,-1"), is(122));
    }
}
