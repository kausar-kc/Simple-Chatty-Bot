import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prevNum = scanner.nextInt();
        int num;
        char order = 'n';
        boolean flag = true;

        while (true) {

            num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (order == 'n') {
                order = prevNum < num ? 'a' : prevNum == num ? 'n' : 'd';
            }

            if (order == 'a' && prevNum > num) {
                flag = false;
                break;
            }

            if (order == 'd' && prevNum < num) {
                flag = false;
                break;
            }

            prevNum = num;

        }

        System.out.println(flag);
    }
}
