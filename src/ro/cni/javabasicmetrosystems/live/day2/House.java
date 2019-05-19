package ro.cni.javabasicmetrosystems.live.day2;

public class House {

    private String hidden;

    private String materialType;
    private int numberOfWindows;
    private String address;

    public House(final String materialType,
                 final int numberOfWindows,
                 final String address) {
        this.materialType = materialType;
        this.numberOfWindows = numberOfWindows;
        this.address = address;
    }

    public String getMaterialType() {
        return this.materialType;
    }

    public int getNumberOfWindows() {
        System.out.println(hidden);
        return this.numberOfWindows;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
