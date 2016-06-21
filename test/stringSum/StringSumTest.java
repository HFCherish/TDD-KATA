package stringSum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringSumTest {

    @Test
    public void shouldEmptyStringCannotBeConvertedToNaturalNumber() {
        assertThat( StringSum.isNaturalNumber(""), is(false) );
        assertThat( StringSum.isNaturalNumber(null), is(false) );
    }

    @Test
    public void shouldNonNaturalNumberStringCannotBeConvertedToNaturalNumber() {
        assertThat( StringSum.isNaturalNumber("89&*("), is(false));
        assertThat( StringSum.isNaturalNumber("-678"), is(false));
        assertThat( StringSum.isNaturalNumber("78.89"), is(false));
    }

    @Test
    public void shouldNaturalNumberStringCanBeConvertedToNaturalNumber() {
        assertThat( StringSum.isNaturalNumber("78"), is(true));
    }

    @Test
    public void shouldNonNaturalNumberSumNonNaturalNumberIsZero() {
        assertThat( StringSum.sum("32jlkj", ""), is("0") );
    }

    @Test
    public void shouldNonNaturalNumberSumNaturalNumberIsNaturalNumber() {
        assertThat( StringSum.sum("32", "-78"), is("32") );
    }

    @Test
    public void shouldNaturalNumberSumNaturalNumberIsTheRightSum() {
        assertThat( StringSum.sum("1", "2"), is("3") );
        assertThat( StringSum.sum("1", "9"), is("10") );
        assertThat( StringSum.sum("1", "90"), is("91") );
        assertThat( StringSum.sum("1", "99"), is("100") );
        assertThat( StringSum.sum("1", "89"), is("90") );
        assertThat( StringSum.sum("867", "89"), is("956") );
    }
}
