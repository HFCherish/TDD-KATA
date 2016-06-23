public class BowlingGame {
    private int score = 0;
    private int frameCount = 0;
    private int lastRoll = 0;
    private boolean hasSpare = false;
    private boolean hasSpike = false;
    private int spikeCount = 0;

    public void roll(int pins) {
        score += pins;
        addBonusForSpare(pins);
        addBonusForSpike(pins);
        frameCount++;
        checkSpare(pins);
        checkSpike(pins);
        lastRoll = pins;
    }

    private void addBonusForSpare(int pins) {
        if(hasSpare) {
            score += pins;
            hasSpare = false;
        }
    }

    private void addBonusForSpike(int pins) {
        if( hasSpike ) {
            score += pins;
            spikeCount++;
            if(spikeCount == 2){
                hasSpike = false;
                spikeCount = 0;
            }
        }
    }

    private void checkSpike(int pins) {
        if( frameCount == 1 && pins == 10 ) {
            hasSpike = true;
            frameCount = 0;
        }
    }

    private void checkSpare(int pins) {
        if(frameCount == 2) {
            if (lastRoll + pins == 10) {
                hasSpare = true;
            }
            frameCount = 0;
        }
    }

    public int score() {
        return score;
    }
}
