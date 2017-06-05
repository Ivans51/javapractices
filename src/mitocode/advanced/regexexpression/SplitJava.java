package mitocode.advanced.regexexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ivans on 5/1/2017.
 */
public class SplitJava {

    public static void main(String[] args) {

        String list = "Ivan|Pedro|Ricardo|Juan";
        String[] extraction = list.split("\\|", 3);

        for (String element : extraction) {
            System.out.println(element);
        }

    }

}
