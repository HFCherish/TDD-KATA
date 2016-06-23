public class BowlingGame {
    private int[] rollPins;
    private int currentRollIndex;
    private final int TOTAL_FRAMES = 10;

    public BowlingGame() {
        rollPins = new int[TOTAL_FRAMES * 2 + 1];
        currentRollIndex = 0;
    }

    public void roll(int pins) {
        rollPins[currentRollIndex++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < TOTAL_FRAMES; frame++) {
            if(isStrike(rollPins[frameIndex])) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex ++;
            }
            else if(isSpair(frameIndex)) {
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                score += getFrameScore(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private int strikeBonus(int frameIndex) {
        return rollPins[frameIndex + 1] + rollPins[frameIndex + 2];
    }

    private boolean isStrike(int rollPin) {
        return rollPin == 10;
    }

    private int spareBonus(int frameIndex) {
        return rollPins[frameIndex+2];
    }

    private boolean isSpair(int frameIndex) {
        return getFrameScore(frameIndex) == 10;
    }

    private int getFrameScore(int frameIndex) {
        return rollPins[frameIndex] + rollPins[frameIndex+1];
    }
}
