import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int input = 0;
        int output = 0;

        for(int i = 0; i<count; i++) {
            input = scanner.nextInt();
            if (input % 4 == 0 && input > output) {
                output = input;
            }
        }

        System.out.println(output);
    }
}