package oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brake();
        car.start();
        car.stop();
        car.acc();

//        MediaPlayer carMedia = new Car();
//        carMedia.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMedia();

        niceCar.upgradeEngine();
        niceCar.start();
        niceCar.stop();
    }
}
