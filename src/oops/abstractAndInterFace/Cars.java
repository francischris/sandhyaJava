package oops.abstractAndInterFace;

abstract class Cars {


//    public Cars(){
//        System.out.println("In cars constructor");
//    }


    int wheels;
    int gears;

    public void cleanCar(){
        System.out.println("cleaning car");
    }

    abstract void startCar();

    abstract void stopCar();

}
