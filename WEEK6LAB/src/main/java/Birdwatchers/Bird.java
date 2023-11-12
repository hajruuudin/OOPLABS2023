package Birdwatchers;

public class Bird {
    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }

    public String toString(){
        return this.name + "(" + this.latinName + "): " + this.observationCount + " observations";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getObservationCount() {
        return observationCount;
    }

    public void observationIncrease(){
        this.observationCount++;
    }
}
