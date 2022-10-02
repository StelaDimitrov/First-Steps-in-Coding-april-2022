package ExamTwo;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hoursSpend = Integer.parseInt(scanner.nextLine());
        int numberPeople = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double price = 0;

        switch (month) {
            case "march":
            case "april":
            case "may":

                if (time.equals("day")) {
                    price = 10.50;
                } else if (time.equals("night")) {
                    price = 8.40;
                }
                if (numberPeople >= 4) {
                    price = price - price * 0.1;
                }
                if (hoursSpend >= 5) {
                    price = price - price * 0.5;

                }
                break;
            case "june":
            case "july":
            case "august":
                if (time.equals("day")) {
                    price = 12.60;
                } else if (time.equals("night")) {
                    price = 10.20;
                }
                if (numberPeople >= 4) {
                    price = price - price * 0.1;
                }
                if (hoursSpend >= 5) {
                    price = price - price * 0.5;

                }


        }
        double totalPrize = (price * numberPeople) * hoursSpend;
        System.out.printf("Price per person for one hour: %.2f%n",price);
         System.out.printf("Total cost of the visit: %.2f", totalPrize);


    }
}
