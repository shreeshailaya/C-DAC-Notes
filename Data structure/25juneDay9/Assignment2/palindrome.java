package Assignment2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str;
        str=input.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
