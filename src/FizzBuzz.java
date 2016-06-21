public class FizzBuzz {
    public static String print() {
        StringBuilder res = new StringBuilder();
        for( int i=1; i<=100; i++ ){
            if( i%3 == 0 )  res.append("fizz");
            if( i%5 == 0 ) {
                res.append("buzz");
                continue;
            }
            res.append(i);
        }
        return res.toString();
    }
}
