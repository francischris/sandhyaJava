package objectAndClasses;

public class MyCars {

    public static void main(String[] args) {


        Car sandyas = new Car("Audi","q6");
        sandyas.setNumberOfGears(5);
        sandyas.setColor("White");
        System.out.println(sandyas.getBrand());
        System.out.println(sandyas.getModel());


        Car francis = new Car("Volkswagen","polo");
        francis.setBrand("Volkswagen");
        francis.setModel("polo");
        francis.setNumberOfGears(5);
        francis.setColor("Red");

        System.out.println(francis.getBrand());


        Car newCar = someMethod(sandyas);


    }


    public static Car someMethod(Car car){
        System.out.println(car.model);
        car.setNumberOfGears(3);
        return car;

    }


}
