package org.codefinity.interfaces;

public class VideoPlayer implements MediaPlayer {
    @Override
    public void Start() {
        System.out.println("Start playing video.");
    }

    @Override
    public void Stop() {
        System.out.println("Stop playing video.");
    }
}
