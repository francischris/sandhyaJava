package oops.abstractAndInterFace;

public class MyCars extends Cars{


    @Override
    void startCar() {
        System.out.println("My cars starting");
    }

    @Override
    void stopCar() {
        System.out.println("My cars is stopping");
    }


    public void mycarsReverse(){
        System.out.println("reversing");
    }
}
