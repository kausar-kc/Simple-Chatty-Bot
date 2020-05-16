import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight;
        int bridges;
        int bridgeHeight;
        int crashBridge = 0;

        busHeight = scanner.nextInt();
        bridges = scanner.nextInt();

        for (int i = 1; i <= bridges; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                crashBridge = i;
                break;
            }
        }

        if (crashBridge == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + crashBridge);
        }
    }
}