package ExemPreparation;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();
        int count = 0;
        double moneySpend = 0;
        boolean isMoneyFinished = false;
        double NeededMoney = 0;

        while (!productName.equals("Stop")){
            double price = Double.parseDouble(scanner.nextLine());
            count ++;
            if (count % 3 == 0){
                price /= 2;
            }
            if (price > budget){
                isMoneyFinished = true;
                NeededMoney = price - budget;
                break;
            }
            budget -= price;
            moneySpend += price;



            productName = scanner.nextLine();
        }
        if (!isMoneyFinished){
             System.out.printf("You bought %d products for %.2f leva.", count, moneySpend);
        }else {
             System.out.printf("You don't have enough money!%n");
              System.out.printf("You need %.2f leva!", NeededMoney);
        }
    }
}
