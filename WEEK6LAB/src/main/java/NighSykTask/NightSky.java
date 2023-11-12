package NighSykTask;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    int starsInLastPrint = 0;

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){
        Random num = new Random();

        for(int i = 0; i < width; i++){
            double rand_dub = num.nextDouble(1);
            if(rand_dub <= this.density){
                System.out.print("*");
                starsInLastPrint += 1;
            } else{
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    public void print(){
        for(int i = 0; i < this.height; i++){
            printLine();
        }
    }

    public static int startInLastPrint(){
        return startInLastPrint();
    }
}
