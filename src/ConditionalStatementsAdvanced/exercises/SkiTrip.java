package ConditionalStatementsAdvanced.exercises;

import java.util.Locale;
import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayRest = Integer.parseInt(scanner.nextLine());
        String  typeRom = scanner.nextLine();
        String rating = scanner.nextLine();

        double priceRoom = 0;
        double totalPrice = 0;
        dayRest = dayRest - 1;

        switch (typeRom){

            case "room for one person":
                priceRoom = 18;
                    totalPrice = priceRoom * dayRest;

                       System.out.printf("%.2f", totalPrice);
                break;
            case "apartment":
                priceRoom = 25;
                totalPrice = priceRoom * dayRest;

                if (dayRest<10)
                {
                    totalPrice = (priceRoom * dayRest) - (priceRoom * dayRest * 0.30);

                }else if (dayRest >= 10 && dayRest <=15){

                    totalPrice = (priceRoom * dayRest) - (priceRoom * dayRest * 0.35);
                }else{
                    totalPrice = (priceRoom * dayRest) - (priceRoom * dayRest * 0.50);
                }
                break;
            case "president apartment":
                priceRoom = 35;
                totalPrice = priceRoom * dayRest;

                if (dayRest<10)
                {
                    totalPrice = (priceRoom * dayRest) - (priceRoom  * dayRest * 0.10);

                }else if (dayRest >= 10 && dayRest <=15){

                    totalPrice = (priceRoom * dayRest) - (priceRoom * dayRest * 0.15);
                }else{
                    totalPrice = (priceRoom * dayRest) - (priceRoom * dayRest * 0.20);
                }
                break;

        }
        if(rating.equals("positive")){
            totalPrice = totalPrice + totalPrice * 0.25;

        }else {
            totalPrice = totalPrice - totalPrice * 0.10;
        }
            System.out.printf("%.2f",totalPrice);
    }
}
