package org.codefinity.interfaces;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void Start() {
        System.out.println("Start playing audio.");
    }

    @Override
    public void Stop() {
        System.out.println("Stop playing audio.");
    }
}
