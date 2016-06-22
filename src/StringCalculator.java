public class StringCalculator {
    public static int calculate(String numbers) throws Exception {
        if (numbers == null || numbers.length() == 0) return 0;
        String delimiter = "[,|\n]";
        String[] delimiterNumbers = numbers.split("\n");
        if (delimiterNumbers.length > 1) {
            try {
                Integer.valueOf(delimiterNumbers[0]);
            } catch (NumberFormatException exception) {
                delimiter = delimiterNumbers[0];
                numbers = delimiterNumbers[1];
            }
        }
        String[] numbs = numbers.split(delimiter);
        return getSum(numbs);
    }

    private static int getSum(String[] numbs) throws Exception {
        int sum = 0;
        StringBuilder negativeNumbers = new StringBuilder();
        for (String numb : numbs) {
            if (numb.charAt(0) == '-') {
                negativeNumbers.append(numb + ", ");
                continue;
            }
            sum += Integer.valueOf(numb);
        }
        if (negativeNumbers.length() > 0) {
            throw new Exception("negatives not allowed: " + negativeNumbers.substring(0,negativeNumbers.length()-2));
        }
        return sum;
    }
}
