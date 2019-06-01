package ro.cni.javabasicmetrosystems.prepared.day4.generics;

import java.util.List;

public class WildcardFixed {
    //Error
//    void foo(List<?> i) {
//        i.set(0, i.get(0));
//    }

    void foo(List<?> i) {
        fooHelper(i);
    }

    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
}
