package FurstStepsInCoding.exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int vero = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        //	Пакет химикали - 5.80 лв.
        //	Пакет маркери - 7.20 лв.
        //  Препарат - 1.20 лв (за литър)

        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double priceVero = vero * 1.20;

        double totalPrice = pricePens + priceMarkers + priceVero;

        double TotalPriceDiscount = totalPrice - (totalPrice * percent / 100 );

        System.out.println(TotalPriceDiscount);
    }
}