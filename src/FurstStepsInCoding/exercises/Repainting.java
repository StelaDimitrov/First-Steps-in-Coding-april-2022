package FurstStepsInCoding.exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int PlasticBag = Integer.parseInt(scanner.nextLine());
        int Pain = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int HourWork = Integer.parseInt(scanner.nextLine());

        double PricePlasticBag = (PlasticBag + 2) * 1.50;
        double PricePain = (Pain + (Pain * 10 / 100)) * 14.50;
        double PricePainThinner = paintThinner * 5;
        double PriceBag = 0.40;

        double TotalPrice = PricePlasticBag + PricePain + PricePainThinner + PriceBag;
        double SumForWorkers = (TotalPrice * 30 / 100) * HourWork;

        double FinalPrice = TotalPrice + SumForWorkers;

        System.out.println(FinalPrice);

    }




}
