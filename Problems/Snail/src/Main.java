import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int ratio = up/down;
        System.out.println(ratio);
        if(ratio==1){
            down--;
        }

        System.out.println(down);

        int days = height / (up-down);
        System.out.println(days);
    }
}