package ro.cni.javabasicmetrosystems.prepared.day4.generics;

public class GenericMethodBox {

    public static <T, R> String getEnhancedString(T object) {
        return "Enhanced: " + object;
    }
}
