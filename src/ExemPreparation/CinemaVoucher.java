package ExemPreparation;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moviesCount = Integer.parseInt(scanner.nextLine());
        double sumRatings = 0;
        double minRating = 11;
        double maxRating = 0;
        String movieMinRating = "";
        String movieMaxRating = "";

        for (int i = 1; i <= moviesCount; i++) {

            String  movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sumRatings +=rating;

            if (minRating > rating){
                minRating = rating;
                movieMinRating = movieName;
            }
            if (maxRating < rating){
                maxRating = rating;
                movieMaxRating = movieName;
            }



        }
        double avgRating = sumRatings / moviesCount;
          System.out.printf("%s is with highest rating: %.1f%n", movieMaxRating, maxRating);
           System.out.printf("%s is with lowest rating: %.1f%n", movieMinRating, minRating);
            System.out.printf("Average rating: %.1f", avgRating);

    }
}
