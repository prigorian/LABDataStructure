import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

        public class PalindromeChecker {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                if (isPalindrome(input)) {
                    System.out.println(input + " is a palindrome.");
                } else {
                    System.out.println(input + " is not a palindrome.");
                }

                sc.close();
            }

            public static boolean isPalindrome(String input) {
                Queue<Character> queue = new LinkedList<>();
                for (char c : input.toCharArray()) {
                    queue.add(c);
                }

                StringBuilder reversed = new StringBuilder();
                while (!queue.isEmpty()) {
                    reversed.append(queue.remove());
                }

                return input.equals(reversed.toString());
            }
        }

    }