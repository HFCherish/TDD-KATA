import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class OddEvenTest {

    private OddEven oddEven;

    @Before
    public void setUp() {
        oddEven = new OddEven();
    }

    @Test
    public void should_print_odd_for_odd_number() {
        assertThat(oddEven.print(1), is("odd"));
    }

    @Test
    public void should_print_even_for_even_number() {
        assertThat(oddEven.print(4), is("even"));
    }

    @Test
    public void should_print_number_for_prime_number() {
        assertThat(oddEven.print(2), is("2"));
        assertThat(oddEven.print(3), is("3"));
    }

    @Test
    public void should_print_given_specified_range() {
        assertThat(oddEven.print(1, 10), is("odd, 2, 3, even, 5, even, 7, even, odd, even"));

    }
}
