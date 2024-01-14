package org.codefinity;

import org.codefinity.abstraction.SportsCar;
import org.codefinity.abstraction.Truck;
import org.codefinity.abstraction.Vehicle;
import org.codefinity.arraylist.FullDog;
import org.codefinity.inheritence.Parrot;
import org.codefinity.interfaces.AudioPlayer;
import org.codefinity.interfaces.VideoPlayer;
import org.codefinity.polymorphism.Car;
import org.codefinity.polymorphism.SUV;
import org.codefinity.polymorphism.Van;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        doInheritence();
        doPolymorphism();
        doAbstraction();
        doInterfaces();
        usingArrayList();
    }

    private static void doInheritence() {
        Parrot rio = new Parrot();
        //Parent Properties
        rio.color = "blue";
        rio.eat();
        rio.fly();
        rio.canFly = true;

        //Child Properties
        rio.name = "Rio";
        rio.canTalk = true;
        rio.talk();
    }

    private static void doPolymorphism() {
        Car car = new Car();
        car.move();

        SUV suv = new SUV();
        suv.move();

        Van van = new Van();
        van.move();
    }

    private static void doAbstraction() {
        Truck mTruck = new Truck();
        mTruck.move();
        mTruck.stop();

        SportsCar mSport = new SportsCar();
        mSport.move();
        mSport.stop();
    }

    private static void doInterfaces() {
        AudioPlayer mAudioPlayer = new AudioPlayer();
        mAudioPlayer.Start();
        mAudioPlayer.Stop();

        VideoPlayer mVideoPlayer = new VideoPlayer();
        mVideoPlayer.Start();
        mVideoPlayer.Stop();
    }

    private static void usingArrayList() {
        FullDog mSpikes = new FullDog("Spikes", 1);
        FullDog mMamsi = new FullDog("Mamsi", 3);
        FullDog mSpotty = new FullDog("Spotty", 5);
        List<String> mDogsList = new ArrayList<String>();
        mDogsList.add(mSpikes.getFullDog());
        mDogsList.add(mMamsi.getFullDog());
        mDogsList.add(mSpotty.getFullDog());
        System.out.println("Dogs: " + mDogsList);
    }
}