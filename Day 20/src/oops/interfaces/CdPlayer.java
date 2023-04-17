package oops.interfaces;

public class CdPlayer implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("Media starts");
    }

    @Override
    public void stop() {
        System.out.println("Media stops");
    }
}
