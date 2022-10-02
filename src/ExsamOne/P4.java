package ExsamOne;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Students = Integer.parseInt(scanner.nextLine());
         double Group4 =0;
         double Group3 =0;
         double Group2 =0;
         double Group1 =0;
         double counter = 0;


        for (int i = 1; i <= Students ; i++) {

            double rating = Double.parseDouble(scanner.nextLine());

            counter = counter + rating;

            if ( rating < 3){
                Group4++;

            }else if (rating >= 3 && rating <= 3.99){
                Group3++;

            }else if (rating >= 4 && rating <= 4.99){
                Group2++;

            }else if (rating >= 5) {
                Group1++;

            }


        }

        System.out.printf("Top students: %.2f%%%n", Group1/Students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", Group2/Students *100 );
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", Group3/Students*100 );
        System.out.printf("Fail: %.2f%%%n", Group4/Students * 100);
        System.out.printf("Average: %.2f", counter/Students);





    }
}
