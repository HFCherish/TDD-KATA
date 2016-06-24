public class CalcStats {
    private int minimum;
    private int maxmum;
    private int count;
    private double avg;

    public void calculate(int[] numbers) {
        minimum = numbers[0];
        maxmum = numbers[0];
        avg = 0;
        for( int number: numbers) {
            if (number < minimum) {
                minimum = number;
            }
            if (number > maxmum) {
                maxmum = number;
            }
            avg += number;
        }
        count = numbers.length;
        avg /= count;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaxmum() {
        return maxmum;
    }

    public int getCount() {
        return count;
    }

    public double getAvg() {
        return avg;
    }
}
