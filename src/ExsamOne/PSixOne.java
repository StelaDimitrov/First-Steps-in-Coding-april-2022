package ExsamOne;

import java.util.Scanner;

public class PSixOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Num1 = Integer.parseInt(scanner.nextLine());
        int Num2 = Integer.parseInt(scanner.nextLine());
        int Num3 = Integer.parseInt(scanner.nextLine());

        boolean flag = true;

        for (int i = 1; i <= Num1; i++) {
            for (int j = 2; j <= Num2; j++) {
                for (int k = 1; k <= Num3; k++) {

                    if (i % 2 == 0) {
                        i++;
                    } else if (k % 2 ==0){
                        k++;
                    }
                    if (Num2 % j == 0) {
                        flag = false;
                        break;
                    }
                    if (flag) {
                        j++;
                    }
                    System.out.printf("%d%d%d%n", i, j, k);


                }

            }

        }
    }
}









