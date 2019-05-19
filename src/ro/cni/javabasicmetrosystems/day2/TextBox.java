package ro.cni.javabasicmetrosystems.day2;

public class TextBox {
    int width;
    int lenght;
    String text;

    public TextBox(int width, int length, String text){
        this.width = width;
        this.lenght = length;
        this.text = text;
    }

    public int getArea() {
        return width * lenght;
    }
}
