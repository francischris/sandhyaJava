package oops.abstractAndInterFace;

public class HarleyDavidson implements Bikes{
    @Override
    public void startBike() {

        System.out.println("Start HD Bike");
    }

    @Override
    public void stopBike() {
        System.out.println("Stop HD Bike");
    }

    @Override
    public void CleanBike() {
        System.out.println("Clean HD Bike");
    }


}
