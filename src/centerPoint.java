import java.util.Scanner;

public class centerPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printCenterPointNumbers(x1, y1, x2, y2);
    }

    private static void printCenterPointNumbers(int x1, int y1, int x2, int y2) {
       int firstPoint = (x1 * x1) + (y1 * y1);
       int secondPoint = (x2 * x2) + (y2 * y2);


       if (firstPoint > secondPoint){
           System.out.println("(" + x2 + "," + " " + y2 + ")");
       }else {
           System.out.println("(" + x1 + "," + " " + y1 + ")");
       }

    }
}
