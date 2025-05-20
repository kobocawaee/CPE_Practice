/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gcd;

import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            
            if(n == 0){
                break;
            }
            
            int sum = 0;
            for(int i=1; i<n; i++){
                for(int j=i+1; j<=n; j++){
                    sum += GCD(i, j);
                }
            }
            
            System.out.println(sum);
        }
    }
    
    public static int GCD(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return GCD(num2, num1%num2);
    }
    
}
