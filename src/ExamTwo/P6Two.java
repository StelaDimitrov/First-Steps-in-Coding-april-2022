package ExamTwo;

import java.util.Scanner;

public class P6Two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());
        double averageGoldDay = 0;

        for (int i = 1; i <= locations; i++) {

            double expectedExtraction = Double.parseDouble(scanner.nextLine());
            int daysPerLocation = Integer.parseInt(scanner.nextLine());
            double totalExtracted = 0;

            for (int j = 1; j <= daysPerLocation; j++) {

                double goldExtracted = Double.parseDouble(scanner.nextLine());

                totalExtracted += goldExtracted;
                averageGoldDay = totalExtracted / daysPerLocation;

            }
            if (averageGoldDay >= expectedExtraction) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldDay);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedExtraction - averageGoldDay);
            }
        }
    }
}



