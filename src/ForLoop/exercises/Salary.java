package ForLoop.exercises;

        import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int totalSalary = 0;

        for (int i = 1; i <= n; i++) {
            String nameTab = scanner.nextLine();

            if (nameTab.equals("Facebook")) {
                salary -= 150;
            } else if (nameTab.equals("Instagram")) {
                salary -= 100;
            } else if (nameTab.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {

                System.out.println("You have lost your salary.");
            }


        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
