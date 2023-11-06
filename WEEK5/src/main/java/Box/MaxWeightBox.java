package Box;

import java.util.ArrayList;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Thing> box;

    public MaxWeightBox(int maxWeight) {
        this.currentWeight = 0;
        this.maxWeight = maxWeight;
        this.box = new ArrayList<Thing>();
    }

    public void add(Thing thing){
        if(this.currentWeight < this.maxWeight){
            this.box.add(thing);
            this.currentWeight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.box.contains(thing);
    }
}
