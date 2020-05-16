import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();

        int year = 0;
        double percentage = 0;
        double amount = m;

        while (amount < k) {
            percentage = p / 100.0d * amount;
            amount += percentage;
            year++;
        }

        System.out.println(year);
    }
}