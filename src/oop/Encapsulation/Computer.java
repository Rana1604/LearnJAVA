package oop.Encapsulation;

public class Computer {
    // Data Hiding

    private String computerName;
    private String computerBrand;
    private String computerPrice;
    public boolean isAvailable;

    public Computer() {

    }

    // Getter (Return type) and Setter (Non Return type)


    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getComputerBrand() {
        return computerBrand;
    }

    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }

    public String getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(String computerPrice) {
        this.computerPrice = computerPrice;
    }
}
