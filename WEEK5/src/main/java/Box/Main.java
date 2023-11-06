package Box;

public class Main {
    public static void main(String[] args){
        Box thing1 = (Box) new Thing("Senna", 4);
        Box maxBox = (Box) new MaxWeightBox(10);
        Box oneBox = (Box) new OneThingBox();
        Box blackBox = (Box) new BlackHoleBox();

        if(thing1 instanceof Thing){
            Thing thing2 = (Thing) new Thing("Senna", 4);
        }

        if(maxBox instanceof MaxWeightBox){
            MaxWeightBox maxBox2 = (MaxWeightBox) new MaxWeightBox(10);
        }

        if(oneBox instanceof OneThingBox){
            OneThingBox oneBox2 = (OneThingBox) new OneThingBox();
        }

        if(blackBox instanceof BlackHoleBox){
            BlackHoleBox blackBox2 = (BlackHoleBox) new BlackHoleBox();
        }

    }
}
