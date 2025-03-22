package Test3;

public class Cars {
    private String brand;
    private double price;
    private String color;

    //空参
    public Cars(){}

    //全参
    public Cars(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //get/set
    public String getBrand() {return brand;}
    public void setBrand(String brand) {
        this.brand = this.brand;
    }

    public double getPrice() {return price;}
    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {return color;}
    public void setColor(String color) {
        this.color = color;
    }
}
