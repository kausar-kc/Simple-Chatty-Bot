import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        System.out.println(word.substring(startIndex, ++endIndex));
    }
}
