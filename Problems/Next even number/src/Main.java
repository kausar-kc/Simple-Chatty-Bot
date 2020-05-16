import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(!(number>10000)){
            if(++number % 2 == 0){
                    System.out.println(number);
            }
            else{
                System.out.println(++number);
            }

        }
    }
}