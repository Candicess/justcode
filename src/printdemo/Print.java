package printdemo;

import java.util.Random;

public class Print{
    public static void printA(){
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if(r.nextInt(4) == 0) {
                    System.out.print("O");
                } else {
                    System.out.print("#");
                }
            }

            System.out.println("");
        }
    }

    public static void printB(){
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if(r.nextInt(4) == 0) {
                    System.out.print("O");
                } else {
                    System.out.print("B"); //only line changed
                }
            }

            System.out.println("");
        }
    }

    public static void main(String[] arrs){
        long l1 = System.currentTimeMillis();
        printA();
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);
    }
}


