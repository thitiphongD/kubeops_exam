import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        String a = "";
        String b = "";
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter string : ");
            a = input.nextLine();
        }
        int n = a.length();
        for (int i = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println(a + " is Palindrome.");
        } else {
            System.out.println(a + " is not Palindrome.");
        }
    }
}
