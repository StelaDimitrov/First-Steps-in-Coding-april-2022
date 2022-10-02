package ConditionalStatements.exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMetar = Double.parseDouble(scanner.nextLine());

        double resistance = Math.floor(distance / 15) * 12.5;

        double IvanTime = distance * secPerMetar + resistance;

        if ( IvanTime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", IvanTime);

        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", IvanTime - worldRecord);

        }


        }

    }

