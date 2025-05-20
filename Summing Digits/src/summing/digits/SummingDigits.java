/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package summing.digits;

import java.util.*;
public class SummingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String line = sc.nextLine();
            if (line.equals("0")) break;

            int result = g(line);
            System.out.println(result);
        }
    }
    
    static int g(String n){
        while(n.length() > 1){
            int sum = 0;
            for(char c : n.toCharArray()){
                sum += c - '0';
            }
            n = String.valueOf(sum);
        }
        return Integer.parseInt(n);
    }
}
