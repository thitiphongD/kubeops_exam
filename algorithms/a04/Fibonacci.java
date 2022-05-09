import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input : n = ");
            int n = input.nextInt();
            System.out.print("Output : ");
            int a = 0;
            int b = 1;

            for (int i = 0; i <= n; i++) {
                System.out.print(a + ", ");
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
