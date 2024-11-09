package timer;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {


        int min ;
        int sec = 59;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter minute for timer: ");
        min= scanner.nextInt();

        while (min >= 0) {
            //for (int j = min; j >=0; j--) {

            for (int i = sec; i >= 0; i--) {

                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(min + ":" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                if (i == 0) {
                    min--;
                }
            }

            // System.out.println(min + ":" + sec);
        }
    }




}
