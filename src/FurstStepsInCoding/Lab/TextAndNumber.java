package FurstStepsInCoding.Lab;

import java.util.Scanner;

public class TextAndNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

    }
}
// %s (String), %d (int), %f (double), %c (char), %n (new line)