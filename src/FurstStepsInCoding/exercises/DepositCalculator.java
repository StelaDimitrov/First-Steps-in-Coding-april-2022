package FurstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Deposit = Double.parseDouble(scanner.nextLine());
        int Mount = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double result = Deposit + Mount * ((Deposit * ( percent / 100)) / 12);

        System.out.println(result);


        }

    }

