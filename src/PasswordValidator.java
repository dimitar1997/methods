import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean passIsValid = true;

        if (!checkLeight(password)){
            passIsValid = false;
        }

        if (!onlyLettersDigits(password)) {
            passIsValid = false;
        }
        if (!pass2digits(password)){
            passIsValid = false;
        }
        if (passIsValid){
            System.out.println("Password is valid");
        }
    }

    private static boolean onlyLettersDigits(String password) {
  boolean isLegal = false;
        for (int i = 0; i < password.length() ; i++) {
            int letter = (int) password.charAt(i);
            if (letter >= 48 && letter <= 57){
                isLegal = true;
            }else if (letter >= 65 && letter <= 90){
                isLegal = true;
            } else if (letter >= 97 && letter <= 122) {
                isLegal = true;
            }else {
                isLegal = false;
                break;
            }
        }
        if (isLegal){
            return true;
        }else {
            System.out.println("Password must consist only of letters and digits");
            return false;

        }
    }

    private static boolean pass2digits(String password) {
        int digits = 0;
        for (int i = 0; i < password.length() ; i++) {
            int numbersDigits =(int) password.charAt(i);
            if (numbersDigits >= '0' && numbersDigits <= '9'){
                digits++;
            }

        }
        if (digits < 2){
            System.out.println("Password must have at least 2 digits");
            return false;
        }else {
            return true;
        }
    }

    private static boolean checkLeight(String password) {
        if (password.length() >= 6 && password.length() <= 10){
            return true;
        }else {
            System.out.println("Password must be between 6 and 10 characters");
            return  false;
        }
    }
}
