package NighSykTask;

public class Main {
    public static void main(String[] args){
        NightSky nightSky = new NightSky(0.15, 80, 10);
        nightSky.print();
        System.out.println("Stars in last print: " + nightSky.starsInLastPrint);
    }
}
