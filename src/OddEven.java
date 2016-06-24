public class OddEven {
    public String print(int number) {
        if (isEven(number)) return "even";
        if (isOdd(number)) return "odd";
        return String.valueOf(number);
    }

    private boolean isEven(int number) {
        if (number != 2 && number % 2 == 0) return true;
        return false;
    }

    private boolean isOdd(int number) {
        if (number == 1) return true;
        for (int i = 3; i < number; i += 2) {
            if (number % i == 0)
                return true;
        }
        return false;
    }

    public String print(int start, int end) {
        StringBuilder res = new StringBuilder();
        for (int i = start; i <= end; i++) {
            res.append(print(i) + ", ");
        }
        return res.substring(0, res.length() - 2);
    }
}
