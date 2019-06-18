package ro.cni.javabasicmetrosystems.live.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {

        String testText = "Un vultur 9 sta pe pisc cu un pix in plisc!";


//        System.out.println(testText.matches(".*"));
//        System.out.println("s".matches(".+"));

        final Pattern compile = Pattern.compile("");
        final Matcher matcher = compile.matcher(testText);

        System.out.println(matcher.matches());
        System.out.println(matcher.find());
        System.out.println(matcher.replaceAll("A"));

    }
}
