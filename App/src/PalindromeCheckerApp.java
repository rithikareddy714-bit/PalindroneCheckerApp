//UC7: Deque-Based Optimized Palindrome Checker
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Input: ");
        String input = sc.nextLine();


        input = input.toLowerCase();


        Deque<Character> deque = new LinkedList<>();


        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;


        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear  = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}