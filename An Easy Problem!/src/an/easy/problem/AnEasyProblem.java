/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package an.easy.problem;

import java.util.*;
public class AnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String R = sc.nextLine().trim();
            if (R.isEmpty()) continue;

            int maxDigit = 0;
            for (char c : R.toCharArray()) {
                int val = getValue(c);
                if (val > maxDigit) maxDigit = val;
            }

            boolean found = false;

            for (int base = maxDigit + 1; base <= 62; base++) {
                long value = 0;
                for (char c : R.toCharArray()) {
                    value = value * base + getValue(c);
                }

                if (value % (base - 1) == 0) {
                    System.out.println(base);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("such number is impossible!");
            }
        }
    }

    // 將字元轉換為其對應的數值
    static int getValue(char c) {
        if (Character.isDigit(c)) return c - '0';
        if (Character.isUpperCase(c)) return c - 'A' + 10;
        return c - 'a' + 36;
    }
}
