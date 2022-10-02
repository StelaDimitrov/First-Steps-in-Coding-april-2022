package ConditionalStatements.exercises;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;

        double statistsClothesPrice = statist * clothesPrice;


        if (statist >150){

            statistsClothesPrice = statistsClothesPrice - (statistsClothesPrice*0.10);

        }
        double TotalPrice = decorPrice + statistsClothesPrice;

        if (budget >=TotalPrice ){

            System.out.println(("Action!"));
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - TotalPrice);
        } else {

            System.out.println(("Not enough money!"));
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - TotalPrice));

        }



    }
}
