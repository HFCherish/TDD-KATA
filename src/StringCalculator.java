public class StringCalculator {
    public static int calculate(String numbers) {
        if (numbers == null || numbers.length() == 0) return 0;
        String[] numbs = numbers.split(",");
        int sum = 0;
        for( String numb: numbs ) {
            sum += Integer.valueOf(numb);
        }
        return sum;
    }
}
