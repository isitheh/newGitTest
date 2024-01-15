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

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        doInheritence();
        doPolymorphism();
        doAbstraction();
        doInterfaces();
        usingArrayList();
        arrayAndLinkedList();
        usingQueueDeQueue();
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

    private static void arrayAndLinkedList() {
        List<Integer> mArrayList = new ArrayList<>();
        List<Integer> mLinkedList = new LinkedList<>();
        Random mRandom = new Random();
        for(int i = 0; i < 1000000; i++) {
            int mRandomVal = mRandom.nextInt(100);
            mArrayList.add(mRandomVal);
            mLinkedList.add(mRandomVal);
        }
        long arrStartTime = System.nanoTime();
        mArrayList.add(1000, 50);
        long arrEndTime = System.nanoTime();
        System.out.println("ArrayList Execution Time: " + (arrEndTime - arrStartTime));
        long linkedStartTime = System.nanoTime();
        mLinkedList.add(1000, 50);
        long linkedEndTime = System.nanoTime();
        System.out.println("LinkedList Execution Time: " + (linkedEndTime - linkedStartTime));
    }

    private static void usingQueueDeQueue() {
        Queue<String> mQue = new LinkedList<>();
        mQue.add("One");
        mQue.add("Two");
        mQue.add("Three");
        System.out.println("Que: " + mQue);

        Deque<String> mDeQue = new LinkedList<>();
        mDeQue.addFirst("Letter A");
        mDeQue.addLast("Letter B");
        System.out.println("DeQue: " + mDeQue);
        mDeQue.addLast("Letter 0");
        System.out.println("DeQue: " + mDeQue);
    }
}