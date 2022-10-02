package ExsamOne;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int paketSee = Integer.parseInt(scanner.nextLine());
        int paketMountain = Integer.parseInt(scanner.nextLine());
        double PriceSea = 680;
        double priceMountain = 499;
        int countS = 0;
        int countM = 0;

        String paket = scanner.nextLine();

        while (!paket.equals("Stop")) {

            if (paketSee <= 0 && paketMountain <= 0) {
                break;

            }
            if (paket.equals("sea")) {
                if (paketSee <= 0) {
                    paket = scanner.nextLine();
                    continue;
                }else {
                    paketSee--;
                    countS++;
                }


            } else if (paket.equals("mountain")) {
                if (paketMountain <= 0) {
                    paket = scanner.nextLine();
                    continue;

                } else {
                    paketMountain--;
                    countM++;
                }
            }

            paket = scanner.nextLine();

        }
        double totalPrice = countS * PriceSea + countM * priceMountain;

        if (paketSee == 0 && paketMountain == 0) {

            System.out.printf("Good job! Everything is sold.%n");
            System.out.printf("Profit: %.0f leva.", totalPrice);

        } else {
            System.out.printf("Profit: %.0f leva.", totalPrice);


        }


    }
}
