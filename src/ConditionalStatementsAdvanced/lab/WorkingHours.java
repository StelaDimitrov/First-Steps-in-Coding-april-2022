package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Wednesday":
            case "Saturday":
            case "Tuesday":
            case "Thursday":
            case "Friday":

                if (hour >= 10 && hour <= 18){
                     System.out.printf("open");
                }else{
                     System.out.printf("closed");
                }
                break;
            case "Sunday":
                System.out.printf("closed");

        }

    }

}
