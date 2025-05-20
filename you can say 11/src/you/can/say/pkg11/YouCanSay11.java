/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package you.can.say.pkg11;

import java.util.*;
public class YouCanSay11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String num = sc.nextLine().trim();
        
            if(num.equals("0")){
                break;
            }
            
            int oddSum = 0;
            int evenSum = 0;
            
            for(int i=0; i<num.length(); i++){
                int digit = num.charAt(num.length() - 1 - i) - '0';

                if (i % 2 == 0) {
                    oddSum += digit;
                } else {
                    evenSum += digit;
                }
            }
            
            int diff = Math.abs(oddSum - evenSum);

            if (diff % 11 == 0) {
                System.out.println(num + " is a multiple of 11.");
            } else {
                System.out.println(num + " is not a multiple of 11.");
            }
        }
        
    }
    
}
