package NestedLoops.lab;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean isFaund = false;

        int combinations = 0;

        for (int i = start ; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinations++;


                if ( i + j == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations,i,j,magicNumber);
                    isFaund = true;
                    break;
                }

            }
            if (isFaund){
                break;
            }

        }
        if (!isFaund){
              System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);

        }

    }
}
