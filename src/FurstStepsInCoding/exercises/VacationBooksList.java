package FurstStepsInCoding.exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int page = Integer.parseInt(scanner.nextLine());
        int pageForOneHour = Integer.parseInt(scanner.nextLine());
        int Days = Integer.parseInt(scanner.nextLine());

        int TimeForRead = page / pageForOneHour;
        int TimeReadForADay = TimeForRead / Days;

        System.out.println(TimeReadForADay);

    }
}
