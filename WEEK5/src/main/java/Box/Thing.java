package Box;

public class Thing extends Box{
    private String name;
    private int weight;

    public Thing(String name){
        this.name = name;
        if(weight < 0){
            throw new IllegalArgumentException("The wight given cannot be negative");
        } else {
            this.weight = 5;
        }
    }
    public Thing(String name, int weight){
        this.name = name;
        if(weight < 0){
            throw new IllegalArgumentException("The wight given cannot be negative");
        } else {
            this.weight = weight;
        }
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Thing other = (Thing) obj;

        if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void add(Thing thing) {

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
