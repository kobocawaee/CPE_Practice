/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primary.arithmetic;

import java.util.*;
public class PrimaryArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            if(a==0 && b==0){
                break;
            }
            
            int c = 0;
            int ans = 0;
            while(a>0 || b>0){
                int digitA = (int)(a%10);
                int digitB = (int)(b%10);
                
                int sum = digitA + digitB + c;
                
                if(sum>=10){
                    c = 1;
                    ans += 1;
                }
                else{
                    c=0;
                }
                
                a/=10;
                b/=10;
            }
            
            if(ans == 0){
                System.out.println("No carry operation");
            }
            else if(ans == 1){
                System.out.println("1 carry operation");
            }
            else{
                System.out.println(ans + " carry operation");
            }
        }
    }
    
}
