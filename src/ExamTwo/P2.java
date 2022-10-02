package ExamTwo;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double heightMen = Double.parseDouble(scanner.nextLine());

        double rocketSize = width * length * height;
        double roomSize = (heightMen + 0.40) * 2 * 2;

        double space = Math.floor(rocketSize / roomSize);

        if (space >= 3 && space <= 10){

             System.out.printf("The spacecraft holds %.0f astronauts.", space);
        } else if (space < 3){

             System.out.printf("The spacecraft is too small.");
        }else if (space > 10){
             System.out.printf("The spacecraft is too big.");
        }


    }
}
