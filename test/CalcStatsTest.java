import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class CalcStatsTest {

    private CalcStats calcStats;

    @Test
    public void should_get_stats_for_one_number() {
        calcStats = new CalcStats(new int[] {1});
        checkStatistics(1, 1, 1, 1);
    }

    @Test
    public void should_get_stats_for_two_numbers() {
        calcStats = new CalcStats(new int[] {2,-1});
        checkStatistics(-1,2,2,0.5);
    }

    @Test
    public void should_get_stats_for_any_length_of_numbers() {
        calcStats = new CalcStats(new int[] {6,9,15,-2,92,11});
        checkStatistics(-2,92,6,21.833333);
    }

    private void checkStatistics(int minimum, int maxmum, int count, double avg) {
        assertThat( calcStats.getMinimum(), is(minimum));
        assertThat( calcStats.getMaxmum(), is(maxmum));
        assertThat( calcStats.getCount(), is(count));
        assertThat( calcStats.getAvg(), is(closeTo(avg,0.01)));
    }
}
