import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BowlingGameTest {

    private BowlingGame game;

    @Before
    public void setUp() {
        game = new BowlingGame();
    }

    private void rollForMany(int frames, int pins) {
        for (int i = 0; i < frames; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void should_score_zero_when_knock_down_nothing() {
        rollForMany(20, 0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void should_add_all_pins_when_no_bonus() {
        rollForMany(20, 1);
        assertThat(game.score(), is(20));
    }

    @Test
    public void should_add_spare_bonus_given_not_the_last_frame_spare() {
        rollOfSpare();
        game.roll(6);
        rollForMany(17, 0);
        assertThat(game.score(), is(22));
    }

    @Test
    public void should_add_spike_bonus_given_not_the_last_frame_spike() {
        rollOfSpike();
        game.roll(5);
        game.roll(4);
        rollForMany(16, 0);
        assertThat(game.score(), is(28));
    }
//
//    @Test
//    public void should_add_bonus_given_last_frame_spare() {
//        rollForMany(18,0);
//        rollOfSpare();
//        game.roll(4);
//        assertThat(game.score(), is(14));
//    }
//
//    @Test
//    public void should_add_bonus_given_last_frame_spike() {
//        rollForMany(18,0);
//        rollOfSpike();
//        game.roll(8);
//        game.roll(2);
//        assertThat(game.score(), is(20));
//    }

    private void rollOfSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollOfSpike() {
        game.roll(10);
    }
}
