package ConditionalStatements.lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // square, rectangle, circle или triangle

        String Figure = scanner.nextLine();
        double area = 0;

        if (Figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        } else if (Figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;

        } else if (Figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;

        } else if (Figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = a * h / 2;
        }
        System.out.printf("%.3f", area);
        }

    }

