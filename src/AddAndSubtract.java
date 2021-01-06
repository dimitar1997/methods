import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
         printResult(first, second, third);
        System.out.println(printResult(first, second, third));
    }

    private static int printResult(int first, int second, int third) {
        int sum = (first + second) - third;
        return sum;
    }
}
