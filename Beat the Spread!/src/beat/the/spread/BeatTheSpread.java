/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beat.the.spread;

import java.util.*;
public class BeatTheSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            int total = sc.nextInt();
            int num = sc.nextInt();
            if(num > total){
                System.out.println("Impossible");
            }
            else{
                int a = num + (total - num)/2;
                int b = (total - num)/2;
                System.out.println(a + " " + b);
            }
        }
    }
    
}
