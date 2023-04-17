package oops.interfaces;

public class NiceCar {
    private Engine engine;
    private MediaPlayer mediaPlayer = new CdPlayer();

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public void startMedia() {
        mediaPlayer.start();
    }

    public void start() {
        engine.start();
    }

    public void upgradeEngine() {
        engine = new ElectricEngine();
    }

    public void stop() {
        engine.stop();
    }

}
