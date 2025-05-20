/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funny.encryption.method;

import java.util.*;
public class FunnyEncryptionMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // 測資筆數

        while (T-- > 0) {
            int M = Integer.parseInt(sc.nextLine());

            // b1: 原本數字的二進位 1 的個數
            String binary = Integer.toBinaryString(M);
            int b1 = countOnes(binary);

            // b2: 轉成十六進位後，每一位變成二進位再數 1 的個數
            String hex = Integer.toHexString(M);
            StringBuilder hexBinary = new StringBuilder();
            for (char c : hex.toCharArray()) {
                int val = Character.digit(c, 16); // 轉成對應數值
                String bin = String.format("%4s", Integer.toBinaryString(val)).replace(' ', '0');
                hexBinary.append(bin);
            }
            int b2 = countOnes(hexBinary.toString());

            System.out.println(b1 + " " + b2);
        }

        sc.close();
    }

    static int countOnes(String bin) {
        int count = 0;
        for (char c : bin.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }
}