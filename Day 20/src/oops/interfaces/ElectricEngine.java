package oops.interfaces;


public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops");

    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerate");

    }
}
