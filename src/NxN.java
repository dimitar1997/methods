import java.util.Scanner;

public class NxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printMatrix(n);
    }

    private static void printMatrix(int n) {

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                for (int k = 1; k <= n ; k++) {
                    if (k == n){
                        System.out.print(k + " ");
                    }
                }

            }
            System.out.println();
        }
    }
}
