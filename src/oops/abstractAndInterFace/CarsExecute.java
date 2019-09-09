package oops.abstractAndInterFace;

public class CarsExecute {


    public static void main(String[] args) {



        MyCars merco = new MyCars();


        merco.startCar();
        merco.stopCar();
        merco.mycarsReverse();
        merco.cleanCar();


        HarleyDavidson hd = new HarleyDavidson();

        hd.startBike();
        hd.stopBike();
        hd.CleanBike();

        Bullet bullet = new Bullet();
        bullet.startBike();
        bullet.stopBike();
        bullet.CleanBike();



    }
}
