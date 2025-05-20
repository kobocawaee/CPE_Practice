/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package what.s.cryptanalysis;

import java.util.*;
public class WhatSCryptanalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] check = new int[26];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().toUpperCase(); // 統一轉成大寫

            for (char ch : line.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    check[ch - 'A']++;
                }
            }
        }
        
        List<Letter> letters = new ArrayList<>();
        for(int i=0; i<26; i++){
            if(check[i]>0){
                letters.add(new Letter((char)('A'+i), check[i]));
            }
        }
        
        Collections.sort(letters, (a, b) -> {
            if (b.count != a.count)
                return b.count - a.count;
            return a.ch - b.ch;
        });

        for (Letter i : letters) {
            System.out.println(i.ch + " " + i.count);
        }
    }
    static class Letter{
        char ch;
        int count;
        
        Letter(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    }
}
