package ForLoop.exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String  nameActor = scanner.nextLine();
        double point = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <people ; i++) {
            String nameJuri = scanner.nextLine();
            double pointJuri = Double.parseDouble(scanner.nextLine());
            int lendth = nameJuri.length();

            point = point + (lendth * pointJuri) / 2;

            if ( point >= 1250.50){

                 System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor,point);
            }


        }

        if ( point < 1250.5)
        {
             System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.50 - point);
        }
    }
}
