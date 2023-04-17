package oops.interfaces;

public class Car implements Engine, Brake, MediaPlayer{
    @Override
    public void brake() {
        System.out.println("Car stops");
    }

    @Override
    public void start() {
        System.out.println("Engine start");

    }

    @Override
    public void stop() {
        System.out.println("Engine stops");

    }

    @Override
    public void acc() {
        System.out.println("Engine accelerate");

    }
}
