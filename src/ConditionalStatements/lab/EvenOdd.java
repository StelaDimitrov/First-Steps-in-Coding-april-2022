package ConditionalStatements.lab;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //proverka dali chisloto e chetno

        if (number % 2 == 0) {
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
}
