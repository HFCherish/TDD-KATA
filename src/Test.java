import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.quote;

public class Test {

    public static void main(String[] args) {
//        Matcher matcher = Pattern.compile("\\[([^\\]]+)\\]").matcher("[***][\n]ds\nfjkls");
//        while (matcher.find())
//            System.out.println("&&&&&&&&&" + matcher.group(1));

        String[] split = "hjhk***jklj,j\nkl".split(quote("***") + "|,");
        for (String every : split)
            System.out.println("test slpit: " + every);
//        Pattern p = Pattern.compile("\\[([^\\]]+)\\]");
//        Matcher m = p.matcher("[***]");
//        while(m.find()) {
//            System.out.println(m.group(0));
//        }
    }
}
