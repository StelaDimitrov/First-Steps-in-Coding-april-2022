package ForLoop.exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        double total = 0;

        for (int i = 1; i <= n ; i++) {
            int m = Integer.parseInt(scanner.nextLine());

            total ++;

            if( m < 200){
                p1++;
            }else if (m <= 399){
                p2++;
            }else if (m <= 599){
                p3++;
            }else if (m <= 799){
                p4++;
            }else {
                p5++;
            }

        }
        double precent = p1 /total * 100;
        double precent2 = p2 /total * 100;
        double precent3 = p3 /total * 100;
        double precent4 = p4 /total * 100;
        double precent5 = p5 /total * 100;

         System.out.printf("%.2f%%%n",precent);
         System.out.printf("%.2f%%%n",precent2);
         System.out.printf("%.2f%%%n",precent3);
         System.out.printf("%.2f%%%n",precent4);
         System.out.printf("%.2f%%%n",precent5);


    }
}
