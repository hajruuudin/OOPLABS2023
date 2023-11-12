package test;

import NighSykTask.NightSky;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(task(119, 17));
    }

    public static int task(int num, int exp){
            int sum = 1;
            for(int i = 1; i < exp;i++){
                sum = sum * num;
            }

            System.out.println(sum);
            sum = sum % 2537;
            return sum;
        }
    }

