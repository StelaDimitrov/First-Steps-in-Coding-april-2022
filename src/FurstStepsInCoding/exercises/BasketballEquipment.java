package FurstStepsInCoding.exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int yearTrainingPay = Integer.parseInt(scanner.nextLine());

        double PriceBasketballSneakers = yearTrainingPay - (yearTrainingPay * 0.4);
        double PriceBasketballOutfit = PriceBasketballSneakers - (PriceBasketballSneakers * 0.2);
        double PriceBasketball = 0.25 * PriceBasketballOutfit;
        double PriceBasketballAccessories = 0.2 * PriceBasketball;
        double TotalPrice = yearTrainingPay + PriceBasketballSneakers + PriceBasketballOutfit + PriceBasketballAccessories + PriceBasketball;

        System.out.println(TotalPrice);


        
    }
}
