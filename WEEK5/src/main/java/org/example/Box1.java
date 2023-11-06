package org.example;

import java.util.ArrayList;

public class Box1 {
    private ArrayList<ToBeStored> box;
    private double maxWeight;
    private double currentWeight;

    public Box1(double maxWeight) {
        this.box = new ArrayList<ToBeStored>();
        this.currentWeight = 0;
        this.maxWeight = maxWeight;
    }

    public String toString(){
        return "Box: " + this.box.size() + " things in it, total weight: " + this.currentWeight;
    }

    public void add(ToBeStored thing){
        if(this.currentWeight < this.maxWeight){
            this.box.add(thing);
            this.currentWeight += thing.weight();
        } else {
            System.out.println("The box has exceeded its weight!");
        }
    }
}
