package objectAndClasses;

public class MyCars {

    public static void main(String[] args) {


        Car sandyas = new Car();
        sandyas.setBrand("Audi");
        sandyas.setModel("Q6");
        sandyas.setNumberOfGears(5);
        sandyas.setColor("White");

        System.out.println(sandyas.getBrand());

        Car francis = new Car();
        francis.setBrand("Volkswagen");
        francis.setModel("polo");
        francis.setNumberOfGears(5);
        francis.setColor("Red");

        System.out.println(francis.getBrand());


    }


}
