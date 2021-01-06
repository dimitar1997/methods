import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
         String numOrStr = scanner.nextLine();

         printResult(input, numOrStr);
    }

    private static void printResult(String input, String numOrStr) {
        switch (input){
            case "int":
                int num = Integer.parseInt(numOrStr) * 2;
                System.out.println(num);
                break;
            case "real":
                double numReal = Double.parseDouble(numOrStr) * 1.5;
                System.out.printf("%.2f", numReal);
                break;
            case "string":
                System.out.println("$" + numOrStr + "$");
                break;
        }
    }
}
