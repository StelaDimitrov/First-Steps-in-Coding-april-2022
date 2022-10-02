package ExamTwo;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());
        double literfuel = Double.parseDouble(scanner.nextLine());

        double goAndBack = 384400 * 2;

        double timeGoAndBack = Math.ceil(goAndBack / speed);

        double totalTime = timeGoAndBack + 3;
        double fuel = literfuel *goAndBack/100;

         System.out.printf("%.0f%n",totalTime);
           System.out.printf("%.0f", fuel);






    }

}
