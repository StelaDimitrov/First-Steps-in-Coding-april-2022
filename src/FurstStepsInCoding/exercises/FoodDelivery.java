package FurstStepsInCoding.exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ChickenMenu = Integer.parseInt(scanner.nextLine());
        int FishMenu = Integer.parseInt(scanner.nextLine());
        int VeganMenu = Integer.parseInt(scanner.nextLine());

        double PriceChickenMenu = ChickenMenu * 10.35;
        double PriceFishMenu =  FishMenu * 12.40;
        double PriceVeganMenu = VeganMenu * 8.15;

        double PriceMenu = PriceChickenMenu + PriceFishMenu + PriceVeganMenu;
        double PriceDessert = PriceMenu * 20 / 100;
        double PriceDelivery = 2.50;

        double FinalPrice = PriceMenu + PriceDessert + PriceDelivery;

        System.out.println(FinalPrice);




    }
}
