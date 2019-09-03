package objectAndClasses;

public class Car {

    String color;
    String brand;
    String model;
    boolean manual;
    int numberOfGears;


    public  Car(String brand,String model){
        this.brand = brand;
        this.model = model;
    }




    public String getBrand() {
        return brand;
    }

    public void setBrand(String myBrand) {
        this.brand = myBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String mycolor) {
        this.color = mycolor;
    }







}
