package ro.cni.javabasicmetrosystems.prepared.day3.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        stringMethods();
        matcherExample();
//        stringRegexExample();
    }

    private static void stringMethods() {
        String testText = "I wish I were in the Carribean!";

        System.out.println(testText.substring(4));
        System.out.println(testText.substring(0, 14));
        System.out.println(testText.length());
        System.out.println(testText + " For sure!");
        System.out.println(testText.equals("Not equal!"));

        System.out.println(testText.replace('I', 'A'));

        System.out.println(String.format("Test data: %s %f", "test", 20.0));
    }

    private static void stringRegexExample() {
        // REGEX
        String complexText = "This is a text with numb9rs and s!mbols for regex.";

        System.out.println(complexText.matches(".*text.*"));

        System.out.println(Arrays.toString(complexText.split("\\s")));

        System.out.println(complexText.replaceFirst("\\w*", "Word"));
        System.out.println(complexText.replaceAll("\\s", "_"));
    }

    private static void matcherExample() {
        final Pattern pattern = Pattern.compile(".s");
        final Matcher matcher = pattern.matcher("asda");

        System.out.println(matcher.matches());
        System.out.println(matcher.find());
    }
}
