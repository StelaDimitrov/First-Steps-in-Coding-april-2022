package WhileLoop.exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String wontedBook = scanner.nextLine();
        int counter = 0;

        String  input = scanner.nextLine();
        boolean isFound = false;

        while (!input.equals("No More Books")){

            if (input.equals(wontedBook)){
                isFound = true;
                break;
            }
            counter ++;


            input = scanner.nextLine();
        }
        if (isFound){
              System.out.printf("You checked %d books and found it.", counter);

        }else {
              System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",counter);


        }



    }
}
