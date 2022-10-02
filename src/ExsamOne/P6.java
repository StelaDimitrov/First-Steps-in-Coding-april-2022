package ExsamOne;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Num1 = Integer.parseInt(scanner.nextLine());
        int Num2 = Integer.parseInt(scanner.nextLine());
        int Num3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < Num1; i++) {
            for (int j = 1; j < 7; j++)
                for (int k = 1; k < Num3; k++) {

                    if (i % 2 == 0 && (j % 2 != 0) && k % 2 == 0) {
                        System.out.printf("%d%d%d%n", i, j, k);


                    }

                }
        }
    }
}







