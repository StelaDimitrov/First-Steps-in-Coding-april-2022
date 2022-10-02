package ExsamOne;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int DancerGroup = Integer.parseInt(scanner.nextLine());
        double NumPoints = Double.parseDouble(scanner.nextLine());
        String Season = scanner.nextLine();
        String Place = scanner.nextLine();
        double charity = 0;

        double PriceBG = DancerGroup * NumPoints;
        double PriceAD = DancerGroup * NumPoints;
        double priceSumAD = PriceAD + PriceAD / 2;


        if (Season.equals("summer") && Place.equals("Bulgaria")) {

            PriceBG = PriceBG - PriceBG * 0.05;
            charity = PriceBG * 0.75;
            double leftMoney = PriceBG - charity;
            double moneyForDancer = leftMoney / DancerGroup;

            System.out.printf("Charity - %.2f%n", charity);
            System.out.printf("Money per dancer - %.2f", moneyForDancer);

        } else if (Season.equals("winter") && Place.equals("Bulgaria")) {
            PriceBG = PriceBG - PriceBG * 0.08;
            charity = PriceBG * 0.75;
            double leftMoney = PriceBG - charity;
            double moneyForDancer = leftMoney / DancerGroup;

            System.out.printf("Charity - %.2f%n", charity);
            System.out.printf("Money per dancer - %.2f", moneyForDancer);

        } else if (Season.equals("summer") && Place.equals("Abroad")) {
            priceSumAD = priceSumAD - priceSumAD * 0.10;
            charity = priceSumAD * 0.75;
            double leftMoney = priceSumAD - charity;
            double moneyForDancer = leftMoney / DancerGroup;

            System.out.printf("Charity - %.2f%n", charity);
            System.out.printf("Money per dancer - %.2f", moneyForDancer);


        } else if (Season.equals("winter") && Place.equals("Abroad")) {
            priceSumAD = priceSumAD - priceSumAD * 0.15;
            charity = priceSumAD * 0.75;
            double leftMoney = priceSumAD - charity;
            double moneyForDancer = leftMoney / DancerGroup;

            System.out.printf("Charity - %.2f%n", charity);
            System.out.printf("Money per dancer - %.2f", moneyForDancer);
        }
    }

    }
