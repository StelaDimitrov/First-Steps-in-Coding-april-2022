package ExemPreparation;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double sumForOneDay = tickets * ticketPrice;

        double totalIncome = sumForOneDay * days;
        // 100% - precent = resultPersent
        // resultPrecent/100
        // totalIncome * resultPresent

        totalIncome = totalIncome * ((100 - percent)/100.0);



          System.out.printf("The profit from the movie %s is %.2f lv.", name, totalIncome);




        }
    }


