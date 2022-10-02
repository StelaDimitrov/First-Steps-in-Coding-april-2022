package FurstStepsInCoding.Lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prochitane na vhodni danni
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        // Izchisleniq - presmqtane lice na prawoygylnik
        int result = a * b;
        // printirane na rezultat
        System.out.println(result);
    }
}
