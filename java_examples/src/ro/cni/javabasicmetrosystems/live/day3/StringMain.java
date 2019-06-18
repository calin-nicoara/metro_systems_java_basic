package ro.cni.javabasicmetrosystems.live.day3;

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        equality();

        String testText = "Un vultur sta pe pisc cu un pix in plisc!";

        System.out.println(testText.length());
        System.out.println(testText + " asdasd");
        System.out.println(testText.concat(" asdasd"));

//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("asdas");
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Un rand\r\n");
//        stringBuilder.append("Al doilea rand");

//        System.out.println(stringBuilder.toString());

//        System.out.println(testText.substring(5));
//        System.out.println(testText.substring(5, 10));
//        System.out.println(testText.substring(testText.length()-10, testText.length()));
        System.out.println(testText.indexOf("v"));
        System.out.println(testText.charAt(3));

        System.out.println(testText.replace("vultur", "elefant"));

        String email = "calin2811@gmail.com";
        String tel = "73434343";
        System.out.println("email: " + email + " telefon: " + tel);

        System.out.println(String.format("Email: %s, tel: %s",email, tel));

        System.out.println(Arrays.toString(testText.split(" ")));

        System.out.println("Email".equalsIgnoreCase("email"));

        System.out.println(testText.indexOf("vultur"));
    }

    private static void equality() {
        String maven = "maven";
        String maven2 = "maven";
        String maven3 = new String("maven");

        System.out.println(maven == maven2);
        System.out.println(maven.equals(maven3));
    }
}
