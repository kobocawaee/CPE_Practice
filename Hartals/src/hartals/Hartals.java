/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hartals;

import java.util.*;
public class Hartals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n-- > 0){
            int day = sc.nextInt();
            int p = sc.nextInt(); //政黨數
            int[] hartal = new int[p];
            
            for(int i=0; i<p; i++){
                hartal[i] = sc.nextInt();
            }
            
            boolean[] days = new boolean[day+1];
            int ans = 0;
            
            for(int i:hartal){
                for(int j=i; j<=day; j+=i){
                    int Weekend = j % 7;
                    if (Weekend == 6 || Weekend == 0) {
                        continue;
                    }
                    if(!days[j]){
                        days[j] = true;
                        ans++;
                    }
                }
            }
            
            System.out.println(ans);
            
        }
    }
    
}
