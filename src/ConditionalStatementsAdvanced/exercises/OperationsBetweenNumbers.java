package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());

        String operation = scanner.nextLine();

        double result = 0;

        if (operation.equals("+")){
            result = N1 + N2;
              System.out.printf("%d + %d = %.0f", N1, N2, result);

            if ( result % 2 == 0){
                  System.out.println(" - even");

            }else {
                System.out.println(" - odd");

            }
        }else if (operation.equals("-")){
            result = N1 - N2 ;
            System.out.printf("%d - %d = %.0f", N1, N2, result);
            if ( result % 2 == 0){
                System.out.println(" - even");

            }else {
                System.out.println(" - odd");
            }
        }else if(operation.equals("*")){
            result = N1 * N2;
            System.out.printf("%d * %d = %.0f", N1, N2, result);
            if ( result % 2 == 0){
                System.out.println(" - even");

            }else {
                System.out.println(" - odd");
            }

        } else if (operation.equals("/")) {


            if (N1 == 0){
                  System.out.printf("Cannot divide %d by zero",N2);

            }else if (N2 == 0){
                System.out.printf("Cannot divide %d by zero ",N1);

            }else {
                result = N1/(N2*1.00);
                System.out.printf("%d / %d = %.2f", N1, N2,result);
            }


        }else if(operation.equals("%")){
            if (N2 == 0){
                System.out.printf("Cannot divide %d by zero ",N1);

            }else {
                result = N1 % N2;
                System.out.printf("%d %% %d = %.0f", N1, N2,result);
            }



        }
    }
}
