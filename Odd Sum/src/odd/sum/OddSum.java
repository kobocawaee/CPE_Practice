/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odd.sum;

import java.util.*;
public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int sum = 0;
            for(int j=a; j<=b; j++){
                if(j%2 == 1){
                    sum+=j;
                }
            }
            
            System.out.println("Case " + i + ": " + sum);
        }
    }
    
}
