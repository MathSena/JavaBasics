package br.com.mathsena.exercicios;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@Slf4j
public class EvenPrimeOdd {

    public static void main(String[] args) throws IOException {

        log.info("""
        Java 8 Lambda Challenge:
        1. isOdd(): Check if a number is odd or even.
        2. isPrime(): Check if a number is prime or composite.
        3. isPalindrome(): Check if a number is a palindrome.
        
        Input: Handled by the editor's locked stub code.
        Output: Displayed by the editor's locked stub code.
        
        Sample Input:
        - First line: An integer (number of test cases).
        - Subsequent lines: A test case with two space-separated integers. The first denotes the condition (1 for Odd/Even, 2 for Prime, 3 for Palindrome). The second denotes the number to be checked.
        """);

        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }

    interface PerformOperation {
        boolean check(int a);
    }

    static class MyMath {
        public PerformOperation isOdd() {
            return n -> n % 2 != 0;
        }

        public PerformOperation isPrime() {
            return n -> {
                if (n <= 1) return false;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) return false;
                }
                return true;
            };
        }

        public PerformOperation isPalindrome() {
            return n -> {
                String str = Integer.toString(n);
                String reversed = new StringBuilder(str).reverse().toString();
                return str.equals(reversed);
            };
        }

        public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
        }
    }
}
