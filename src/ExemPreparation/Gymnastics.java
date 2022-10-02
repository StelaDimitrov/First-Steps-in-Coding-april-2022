package ExemPreparation;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String  item = scanner.nextLine();
        double difficulty = 0;
        double performace = 0;

        switch (country){
            case "Bulgaria":
                if (item.equals("ribbon")){
                    difficulty = 9.600;
                    performace = 9.400;

                }else if (item.equals("hoop")){
                    difficulty = 9.550;
                    performace = 9.750;

                }else if (item.equals("rope")){
                    difficulty = 9.500;
                    performace = 9.400;

                }
                break;
            case "Russia":
                if (item.equals("ribbon")){
                    difficulty = 9.100;
                    performace = 9.400;

                }else if (item.equals("hoop")){
                    difficulty = 9.300;
                    performace = 9.800;

                }else if (item.equals("rope")){
                    difficulty = 9.600;
                    performace = 9.000;

                }
                break;
            case "Italy":
                if (item.equals("ribbon")){
                    difficulty = 9.200;
                    performace = 9.500;

                }else if (item.equals("hoop")){
                    difficulty = 9.450;
                    performace = 9.350;

                }else if (item.equals("rope")){
                    difficulty = 9.700;
                    performace = 9.150;

                }
                break;
        }
        double totalPoints = difficulty + performace;
           System.out.printf("The team of %s get %.3f on %s.%n", country, totalPoints, item);

        double neededPoints = 20 - totalPoints;
        double percent = neededPoints / 20 * 100;

          System.out.printf("%.2f%%",percent);

    }
}
