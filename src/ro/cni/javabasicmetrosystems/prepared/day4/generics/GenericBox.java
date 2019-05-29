package ro.cni.javabasicmetrosystems.prepared.day4.generics;

public class GenericBox<T> {
    private T myObject;

    public T getMyObject() {
        return myObject;
    }

    public void setMyObject(final T myObject) {
        this.myObject = myObject;
    }
}
