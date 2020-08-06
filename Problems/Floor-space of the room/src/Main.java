import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        double area = 0.0;

        switch (shape) {
            case "triangle" :
            {
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();

                double s = (a + b + c)/2;
                area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                break;
            }
            case "rectangle" :
            {
                double a = scanner.nextInt();
                double b = scanner.nextInt();

                area = a * b;
                break;
            }
            case "circle" :
            {
                double r = scanner.nextInt();

                area = 3.14 * (r * r);
                break;
            }
        }

        System.out.println(area);
    }
}