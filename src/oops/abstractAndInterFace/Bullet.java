package oops.abstractAndInterFace;

public class Bullet implements Bikes{
    @Override
    public void startBike() {
        System.out.println("Start bullet");
    }

    @Override
    public void stopBike() {
        System.out.println("Stop bullet");
    }

    @Override
    public void CleanBike() {
        System.out.println("Clean bullet");
    }
}
