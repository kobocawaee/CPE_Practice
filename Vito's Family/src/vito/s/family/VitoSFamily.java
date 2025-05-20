/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vito.s.family;

import java.util.*;
public class VitoSFamily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-- > 0){
            int r = sc.nextInt();
            int[] streets = new int[r];
            
            for(int i=0; i<r; i++){
                streets[i] = sc.nextInt();
            }
            
            Arrays.sort(streets);
            int m = streets[r/2];
            
            int ans = 0;
            for(int i : streets){
                ans += Math.abs(i-m);
            }
            
            System.out.println(ans);
        }
    }
    
}
