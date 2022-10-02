package ExamTwo;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        foodKg = foodKg * 1000;

        String input = scanner.nextLine();
        int count = 0;


        while (!input.equals("Adopted")){
            int foodEad = Integer.parseInt(input);

             count += foodEad;
            input = scanner.nextLine();

        }
        if (count <= foodKg){
             System.out.printf("Food is enough! Leftovers: %d grams.", foodKg - count);
        }else {
             System.out.printf("Food is not enough. You need %d grams more.", count - foodKg);
        }

    }
}
