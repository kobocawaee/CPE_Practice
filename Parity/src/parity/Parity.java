/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parity;

import java.util.*;
public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int I = sc.nextInt();
            if (I == 0) break;

            String binary = Integer.toBinaryString(I);
            int count = 0;
            for (char c : binary.toCharArray()) {
                if (c == '1') count++;
            }

            System.out.println("The parity of " + binary + " is " + count + " (mod 2).");
        }
    }
}
