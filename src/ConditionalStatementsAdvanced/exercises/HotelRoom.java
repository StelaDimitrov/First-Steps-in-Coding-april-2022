package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String mount = scanner.nextLine();
        int dayRest = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        switch (mount){

            case "May":
            case "October":
                priceStudio= 50;
                priceApartment = 65;
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }
        if ((mount.equals("May") || mount.equals("October")) && dayRest >7 && dayRest <14)
        {
            priceStudio = priceStudio - priceStudio * 0.05;
             System.out.printf("Apartment: %.2f lv.%n", priceApartment * dayRest);
              System.out.printf("Studio: %.2f lv.", priceStudio * dayRest);

        }else if ((mount.equals("May") || mount.equals("October"))&& dayRest >14){
            priceApartment = priceApartment - priceApartment * 0.10;
           priceStudio =  priceStudio - priceStudio * 0.3;


            System.out.printf("Apartment: %.2f lv.%n", priceApartment *dayRest);
            System.out.printf("Studio: %.2f lv.",priceStudio *dayRest );

        }else if ((mount.equals("May") || mount.equals("October")) && dayRest <=7){

                        System.out.printf("Apartment: %.2 flv%n.", priceApartment*dayRest);
                         System.out.printf("Studio: %.2f lv.", priceStudio*dayRest);

        }
        if ((mount.equals("June") || mount.equals("September")) && dayRest > 14){
           priceApartment = priceApartment - priceApartment * 0.10;
           priceStudio = priceStudio - priceStudio * 0.2;

            System.out.printf("Apartment: %.2f lv.%n", priceApartment*dayRest);
            System.out.printf("Studio: %.2f lv.", priceStudio*dayRest);

        }else if ((mount.equals("June") || mount.equals("September")) && dayRest <= 14){

            System.out.printf("Apartment: %.2f lv.%n", priceApartment*dayRest);
            System.out.printf("Studio: %.2f lv.", priceStudio*dayRest);
        }
        if ((mount.equals("July")|| mount.equals("August"))&& dayRest >14){
            priceApartment = priceApartment - priceApartment * 0.10;

            System.out.printf("Apartment: %.2f lv.%n", priceApartment *dayRest);
            System.out.printf("Studio: %.2f lv.", priceStudio* dayRest);

        }else if (mount.equals("July")|| mount.equals("August")) {

            System.out.printf("Apartment: %.2f lv.%n", priceApartment * dayRest );
            System.out.printf("Studio: %.2f lv.", priceStudio * dayRest);
        }
    }
}
