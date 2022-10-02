package ExsamOne;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double PriceDollarsProcesor = Double.parseDouble(scanner.nextLine());
        double PriceDollarsVideoCard = Double.parseDouble(scanner.nextLine());
        double PriceDollarRAM = Double.parseDouble(scanner.nextLine());
       int CountRAM = Integer.parseInt(scanner.nextLine());
       double percent = Double.parseDouble(scanner.nextLine());

       double LevaProcesor = PriceDollarsProcesor * 1.57;
       double LevaVideoCard = PriceDollarsVideoCard * 1.57;
       double LevaRAM = PriceDollarRAM * 1.57;

       double TotalPriceRAM = LevaRAM * CountRAM;
       double TotalProcesor = LevaProcesor - LevaProcesor * percent;
       double TotalVideo = LevaVideoCard - LevaVideoCard * percent;

       double fainalPrice = TotalPriceRAM + TotalProcesor + TotalVideo;

        System.out.printf("Money needed - %.2f leva.", fainalPrice);






}
    }