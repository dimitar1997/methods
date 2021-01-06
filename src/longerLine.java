import java.util.Scanner;

public class longerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        printLongLine(x1, y1, x2, y2, x3, y3, x4, y4);


    }

    private static void printLongLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (lineLenght(x1, y1, x2, y2) >= lineLenght(x3, y3, x4, y4)){
           printClossesPointFirs(x1, y1, x2, y2);
        } else if (lineLenght(x1, y1, x2, y2) < lineLenght(x3, y3, x4, y4)){
            printClossesPointFirs(x3, y3, x4, y4);
        }
    }

    private static void printClossesPointFirs(double x1, double y1, double x2, double y2) {
        if (distanceToCenter(x1,y2) > distanceToCenter(x2, y2)){
            System.out.printf("(%.0f, %.0f)",x2, y2);
            System.out.printf("(%.0f, %.0f)",x1, y1);
        }else {
            System.out.printf("(%.0f, %.0f)",x1, y1);
            System.out.printf("(%.0f, %.0f)",x2, y2);
        }
    }

    private static double distanceToCenter(double x1, double y2) {
        return Math.sqrt(Math.pow((0 - x1), 2) + Math.pow((0 - y2), 2));
    }

    private static double lineLenght(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
