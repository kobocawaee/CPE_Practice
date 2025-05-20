/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.the.pkg9s;

import java.util.*;
public class The9s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String num = sc.nextLine();
            
            if(num.equals("0")){
                break;
            }
            
            int degree = 0;
            String num2 = num;
            while(num2.length()>1){
                int sum=0;
                for(char c:num2.toCharArray()){
                    sum += c - '0';
                }
                degree++;
                num2 = String.valueOf(sum);
            }
            
            if(num2.equals("9")){
                System.out.println(num + " is a multiple of 9 and has 9-degree " + degree);
            }
            else{
                System.out.println(num + " is not a multiple of 9");
            }
        }
    }
}
