package Box;

import java.util.ArrayList;

public class BlackHoleBox extends Box{
    private ArrayList<Thing> blackBox;

    public BlackHoleBox(){
        this.blackBox = new ArrayList<Thing>();
    }

    public void add(Thing thing){
        this.blackBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
