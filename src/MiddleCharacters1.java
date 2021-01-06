import java.util.Scanner;

public class MiddleCharacters1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] symbols = new char[input.length()];
        for (int i = 0; i < symbols.length ; i++) {
            symbols[i] = input.charAt(i);


        }
        printMiddle(symbols);
    }

    private static void printMiddle(char[] symbols) {
        if (symbols.length %2 == 0){
            System.out.print(symbols[symbols.length / 2  - 1]);
            System.out.print(symbols[symbols.length / 2]);
        }else {
            System.out.print(symbols[symbols.length / 2]);
        }
    }
}
