/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package the.pkg3n.pkg1.problem;

import java.util.*;
public class The3n1Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int start = Math.min(a, b);
            int end = Math.max(a, b);
            
            int ans = 0;
            
            for(int n=start; n<= end; n++){
                int cycle = getCycleLength(n);
                if(cycle > ans){
                    ans = cycle;
                }
            }
            
            System.out.println(a + " " + b + " " + ans);
        }
    }
    
    private static int getCycleLength(int n){
        int c = 1;
        
        while(n!=1){
            if((n&1)==1){
                n=3*n+1;
            }
            else{
                n/=2;
            }
            c++;
        }
        
        return c;
    }
    
}
