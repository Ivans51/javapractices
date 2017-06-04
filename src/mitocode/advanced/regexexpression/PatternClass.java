package mitocode.advanced.regexexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ivans on 5/1/2017.
 */
public class PatternClass {

    public static void main(String[] args) {

        String text = "text Android text text";

        Pattern p = Pattern.compile("text", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        System.out.println(m.matches());
//        System.out.println(m.lookingAt());

        int count = 0;
        while (m.find()) {
            count++;
            System.out.println("Coincidence Nº " + count + " star " + m.start() + " end " + m.end());
        }

        /*boolean p = Pattern.compile(".*text.*", Pattern.CASE_INSENSITIVE).matcher(text).matches();
        System.out.println(p);*/

    }

}
