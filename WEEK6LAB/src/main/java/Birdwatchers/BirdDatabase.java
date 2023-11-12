package Birdwatchers;

import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birdDatabase;

    public BirdDatabase(){
        this.birdDatabase = new ArrayList<Bird>();
    }

    public void add(Bird bird){
        this.birdDatabase.add(bird);
    }

    public void increaseObservation(String name){
        for(Bird bird : this.birdDatabase){
            if(bird.getName().equals(name)){
                bird.observationIncrease();
            }
        }
    }

    public void showStatistics(){
        for(Bird bird : this.birdDatabase){
            System.out.println(bird);
        }
    }

    public void show(String name){
        for(Bird bird : this.birdDatabase){
            if(bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }

}
