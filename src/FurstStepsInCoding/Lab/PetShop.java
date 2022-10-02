package FurstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double NumberBoxFoodForDog = Double.parseDouble(scanner.nextLine());
        double NumberBoxForCatFood = Double.parseDouble(scanner.nextLine());

        double priceDogFood = NumberBoxFoodForDog * 2.50;
        double priceCatFood = NumberBoxForCatFood * 4;
        double finalPrice = priceCatFood + priceDogFood;

        System.out.printf("%s lv.", finalPrice);

    }

}
