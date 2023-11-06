package Box;

import java.util.ArrayList;

public class OneThingBox extends Box{
    private ArrayList<Thing> oneBox;

    public OneThingBox(){
        this.oneBox = new ArrayList<Thing>();
    }

    public void add(Thing thing){
        if(this.oneBox.isEmpty()){
            this.oneBox.add(thing);
        } else {
            System.out.println("Box is full");
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.oneBox.contains(thing);
    }
}
