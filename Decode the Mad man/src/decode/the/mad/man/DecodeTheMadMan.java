/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decode.the.mad.man;

import java.util.*;
public class DecodeTheMadMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String keyboard = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase();
            StringBuilder decoded = new StringBuilder();

            for (char ch : line.toCharArray()) {
                if (ch == ' ' || ch == '\t') {
                    decoded.append(ch);
                } else {
                    int index = keyboard.indexOf(ch);
                    if (index >= 2) {
                        decoded.append(keyboard.charAt(index - 2));
                    } else {
                        decoded.append(ch);
                    }
                }
            }

            System.out.println(decoded);
        }
    }
    
}
