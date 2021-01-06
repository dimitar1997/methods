import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        pritVowelsCount(input);
        System.out.println(pritVowelsCount(input));
    }

    private static int pritVowelsCount(String input) {
        String[] text = input.split("");
        int count = 0;
        for (int i = 0; i < text.length ; i++) {
            String symbol = text[i];
            if (symbol.equals("a") || symbol.equals("e")|| symbol.equals("i")
                    || symbol.equals("o") || symbol.equals("u") || symbol.equals("A")|| symbol.equals("E") || symbol.equals("I")
                    || symbol.equals("O") || symbol.equals("U")){
                count++;
            }
        }
        return count;
    }
}
