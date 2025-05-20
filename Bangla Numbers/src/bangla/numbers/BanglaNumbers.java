/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangla.numbers;

import java.util.*;
public class BanglaNumbers {
    static int caseCount = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long n = sc.nextLong();
            System.out.printf("%4d. %s\n", caseCount++, convert(n));
        }
        sc.close();
    }

    static String convert(long n) {
        if (n == 0) return "0";

        return process(n).trim();
    }

    static String process(long n) {
        StringBuilder result = new StringBuilder();

        if (n >= 10000000) {
            result.append(process(n / 10000000)).append(" kuti ");
            n %= 10000000;
        }

        if (n >= 100000) {
            result.append(n / 100000).append(" lakh ");
            n %= 100000;
        }

        if (n >= 1000) {
            result.append(n / 1000).append(" hajar ");
            n %= 1000;
        }

        if (n >= 100) {
            result.append(n / 100).append(" shata ");
            n %= 100;
        }

        if (n > 0) {
            result.append(n).append(" ");
        }

        return result.toString();
    }
}
