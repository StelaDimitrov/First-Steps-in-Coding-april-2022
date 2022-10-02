package FurstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prochitane na vhodni danni
        String architectname = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        // izchisleniq
        int neededTime = projects * 3;

        //pechatane na rezultat
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                architectname, neededTime, projects);

    }
}
