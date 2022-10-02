package ForLoop.exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countGroup = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        double total = 0;


        for (int i = 1; i <= countGroup ; i++) {

            int group = Integer.parseInt(scanner.nextLine());

            total += group;
            if (group <= 5){
                musala += group;
            }else if (group <= 12){
                monblan +=group;
            }else  if (group <= 25){
                kilimandjaro += group;
            }else if (group <= 40){
                k2 += group;
            }else{
                everest += group;
            }
        }

        double precentMusala = musala / total * 100;
        double precentMonblan = monblan / total * 100;
        double precentKilimanjaro = kilimandjaro / total * 100;
        double precentK2 = k2 / total * 100;
        double precentEverest = everest / total * 100;

         System.out.printf("%.2f%%%n", precentMusala);
         System.out.printf("%.2f%%%n", precentMonblan);
         System.out.printf("%.2f%%%n", precentKilimanjaro);
         System.out.printf("%.2f%%%n", precentK2);
         System.out.printf("%.2f%%%n", precentEverest);


    }
}
