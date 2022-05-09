import java.util.Scanner;

class FizzBuzz {
	public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Input : ");
      int n = input.nextInt();
      for (int i = 0; i <= n; i++) {
        System.out.println(i % 15 != 0 ? i % 5 != 0 ? i % 3 != 0 ? i : "Fizz" : "Buzz" : "FizzBuzz");
      }
    }
  }
}
