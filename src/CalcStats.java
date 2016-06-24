public class CalcStats {
    private final int[] numbers;
    private int minimum;
    private int maxmum;
    private int count;
    private double avg;

    public CalcStats(int[] numbers) {
        this.numbers = numbers;
    }

    public int getMinimum() {
        minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    public int getMaxmum() {
        maxmum = numbers[0];
        for (int number : numbers) {
            if (number > maxmum) {
                maxmum = number;
            }
        }
        return maxmum;
    }

    public int getCount() {
        return numbers.length;
    }

    public double getAvg() {
        avg = 0;
        for (int number : numbers) {
            avg += number;
        }
        avg /= numbers.length;
        return avg;
    }
}
