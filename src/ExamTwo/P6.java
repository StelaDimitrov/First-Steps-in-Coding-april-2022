package ExamTwo;

import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPlace = Integer.parseInt(scanner.nextLine());
        double averageNumber = Double.parseDouble(scanner.nextLine());
        int numberDays = Integer.parseInt(scanner.nextLine());

        double counter = 0;


        for (int i = 1; i <= numberOfPlace; i++)
        {
            for (int j = 1; j < numberDays; j++)
            {
                for (int k = 1; k <= numberDays; k++)
                {

                    int numberKG = Integer.parseInt(scanner.nextLine());
                    counter += numberKG;

                }
                double average = counter / numberDays;
                if (average >= averageNumber) {
                    System.out.printf("Good job! Average gold per day: %.2f.%n", average);

                    counter = 0;

                    averageNumber = Double.parseDouble(scanner.nextLine());
                    numberDays = Integer.parseInt(scanner.nextLine());

                } else {
                    System.out.printf("You need %.2f gold.", averageNumber - average);
                }


            }


        }


    }
}

