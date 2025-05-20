/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tex.quotes;

import java.util.*;
public class TeXQuotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            StringBuilder result = new StringBuilder();

            for (char c : line.toCharArray()) {
                if (c == '"') {
                    if (!check) {
                        result.append("``");
                    } else {
                        result.append("''");
                    }
                    check = !check;
                } else {
                    result.append(c);
                }
            }

            System.out.println(result.toString());
        }
        
    }
}
