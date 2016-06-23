public class BowlingGame {
    private int score = 0;
    private int rollInFrameCount = 0;
    private int lastRoll = 0;
    private boolean hasSpare = false;
    private boolean hasSpike = false;
    private int spikeCount = 0;
    private int frameCount = 0;

    public void roll(int pins) {
        score += pins;
        if (isGameOver())
            return;
        addBonusForSpare(pins);
        addBonusForSpike(pins);
        rollInFrameCount++;
        checkSpare(pins);
        checkSpike(pins);
        lastRoll = pins;
    }

    private boolean isGameOver() {
        return frameCount == 10;
    }

    private void addBonusForSpare(int pins) {
        if (hasSpare) {
            score += pins;
            hasSpare = false;
        }
    }

    private void addBonusForSpike(int pins) {
        if (hasSpike) {
            score += pins;
            spikeCount++;
            if (spikeCount == 2) {
                hasSpike = false;
                spikeCount = 0;
            }
        }
    }

    private void checkSpike(int pins) {
        if (rollInFrameCount == 1 && pins == 10) {
            hasSpike = true;
            startNewFrame();
        }
    }

    private void checkSpare(int pins) {
        if (rollInFrameCount == 2) {
            if (lastRoll + pins == 10) {
                hasSpare = true;
            }
            startNewFrame();
        }
    }

    private void startNewFrame() {
        rollInFrameCount = 0;
        frameCount++;
    }

    public int score() {
        return score;
    }
}
