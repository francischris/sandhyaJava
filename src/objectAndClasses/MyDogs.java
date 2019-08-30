package objectAndClasses;

public class MyDogs {

    public static void main(String[] args) {

        //instantiating
        Dogs pomerin = new Dogs();
        pomerin.age=12;
        pomerin.colour="White";
        pomerin.breed="pomm";
        pomerin.name="whitey";

        pomerin.printAge();
        pomerin.printBreed();
        pomerin.printName();

        Dogs bully = new Dogs();
        bully.age=3;
        bully.colour="Black";
        bully.breed="BullDog";
        bully.name="black";

        bully.printAge();
        bully.printBreed();
        bully.printName();



    }


}
