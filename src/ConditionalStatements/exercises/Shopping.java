package ConditionalStatements.exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());


        double videoCartsPrice = videoCards * 250;
        double cpuPrice = videoCartsPrice * 0.35* cpu;
        double ramPrice = videoCartsPrice * 0.10 * ram;

        double FinalPrice = 0;


        if ( videoCards > cpu){
            FinalPrice = (videoCartsPrice + cpuPrice + ramPrice) * 0.85;

        }else {
            FinalPrice = videoCartsPrice + cpuPrice + ramPrice;
        }

        if (budget>=FinalPrice){
            System.out.printf("You have %.2f leva left!", budget - FinalPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", FinalPrice - budget);
        }
    }
}
