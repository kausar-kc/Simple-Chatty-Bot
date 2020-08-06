import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int detectorPrint;
        int ready = 0;
        int toFix = 0;
        int toReject = 0;


        for (int i = 0; i < n; i++) {
            detectorPrint = scanner.nextInt();
            if (detectorPrint == 0) {
                ready++;
            } else if (detectorPrint == 1) {
                toFix++;
            } else if (detectorPrint == -1) {
                toReject++;
            }
        }

        System.out.println(ready + " " + toFix + " " + toReject);
    }
}