import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.quote;

public class StringCalculator {
    public static int calculate(String numbers) throws Exception {
        if (numbers == null || numbers.length() == 0) return 0;
        String[] delimiterNumbers = numbers.split("\n");
        String delimiter = "[,\n]";
        if (hasSpecifiedDelimiter(delimiterNumbers)) {
            delimiter = getSpecifiedDelimiters(delimiterNumbers[0]);
            numbers = delimiterNumbers[1];
        }
        String[] numbs = numbers.split(delimiter);
        return getSum(numbs);
    }

    private static String getSpecifiedDelimiters(String delimiters) {
        StringBuilder delimiter = new StringBuilder();
        Matcher matcher = Pattern.compile("[^\\[\\]]+").matcher(delimiters);
        while (matcher.find()) {
            delimiter.append(quote(matcher.group()) + "|");
        }
        return delimiter.substring(0, delimiter.length() - 1);
    }

    private static boolean hasSpecifiedDelimiter(String[] delimiterNumbers) {
        return delimiterNumbers.length > 1 && isNotNum(delimiterNumbers[0]);
    }

    private static boolean isNotNum(String input) {
        try {
            Integer.valueOf(input);
        } catch (NumberFormatException exception) {
            return true;
        }
        return false;
    }

    private static int getSum(String[] numbs) throws Exception {
        int sum = 0;
        StringBuilder negativeNumbers = new StringBuilder();
        for (String numb : numbs) {
            int intNumb = Integer.valueOf(numb);
            if (intNumb < 0) {
                negativeNumbers.append(numb + ", ");
                continue;
            }
            sum += (intNumb > 1000) ? 0 : intNumb;
        }
        if (negativeNumbers.length() > 0) {
            throw new Exception("negatives not allowed: " + negativeNumbers.substring(0, negativeNumbers.length() - 2));
        }
        return sum;
    }
}
