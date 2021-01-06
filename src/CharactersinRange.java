import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printCharts(first, second);
    }

    private static void printCharts(char first, char second) {
        if (second < first){
            for (int i = second + 1; i < first; i++) {
                char output = (char) i;
                System.out.print(output + " ");
            }

        }else {
            for (int i = first + 1; i < second; i++) {
                char output = (char) i;
                System.out.print(output + " ");
            }

        }
    }
}
