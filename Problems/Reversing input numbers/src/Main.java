import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        /*int firstDigit = number/10;
        int secondDigit = number%10;*/

        System.out.print(number2 + " " + number1);

    }
}