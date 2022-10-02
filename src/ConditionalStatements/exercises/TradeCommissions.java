package ConditionalStatements.exercises;

import java.util.Scanner;

public class TradeCommissions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        //0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000


        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.05;

                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 0.08;
                } else if (sales > 10000) {
                    commission = sales * 0.12;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.045;

                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 0.10;
                } else if (sales > 10000) {
                    commission = sales * 0.13;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.055;

                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 0.12;
                } else if (sales > 10000) {
                    commission = sales * 0.145;
                }
                break;
            default:
                if (sales < 0) {
                    System.out.println("error");
                }
        }
                if (sales > 0 && town.equals("Sofia") && town.equals("Varna") && town.equals("Plovdiv"))
                {
                System.out.printf("%.2f", commission);

                }else {
                    System.out.println("error");
                }


        }
    }


