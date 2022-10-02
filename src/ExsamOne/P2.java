package ExsamOne;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceThurt = Double.parseDouble(scanner.nextLine());
        double CountForPrice = Double.parseDouble(scanner.nextLine());

        double priceShort = priceThurt * 0.75;
        double priceSocs = priceShort * 0.20;
        double priceBoots =  (priceShort + priceThurt)*2;

        double TotalSum = priceThurt + priceShort + priceSocs +priceBoots;

        double parcentSum = TotalSum - TotalSum * 0.15;

        if (parcentSum > CountForPrice){

             System.out.printf("Yes, he will earn the world-cup replica ball!%n");
              System.out.printf("His sum is %.2f lv.", parcentSum);
        }else{

             System.out.printf("No, he will not earn the world-cup replica ball.%n");
              System.out.printf("He needs %.2f lv. more.", CountForPrice - parcentSum);
        }







    }
}
