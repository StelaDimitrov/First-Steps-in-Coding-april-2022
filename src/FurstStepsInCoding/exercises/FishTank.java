package FurstStepsInCoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int Height = Integer.parseInt(scanner.nextLine());
        double Percentage = Double.parseDouble(scanner.nextLine());

        int Volume = length * width * Height;
        double VolumeInLiters = Volume * 0.001;
        double OccupiedSpace = Percentage / 100;

        double NeedLiters = VolumeInLiters * (1 - OccupiedSpace);

        System.out.println(NeedLiters);


    }
}

