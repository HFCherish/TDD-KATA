package stringSum;

public class StringSum {
    public static boolean isNaturalNumber(String input) {
        if( input == null || input.length()==0 )  return false;
        for( int i=0; i<input.length(); i++ ) {
            char c = input.charAt(i);
            if( !(c>='0' && c<='9') )   return false;
        }
        return true;
    }

    public static String sum(String num1, String num2) {
        boolean isNum1 = isNaturalNumber(num1);
        boolean isNum2 = isNaturalNumber(num2);
        if(!isNum1)  return isNum2 ? num2 : "0";
        if(!isNum2)  return num1;
        return String.valueOf(Integer.valueOf(num1) + Integer.valueOf(num2));
    }
}
