/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package what.is.the.probability;

import java.util.*;
public class WhatIsTheProbability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++){
            int player = sc.nextInt(); //玩家數量
            double p = sc.nextDouble(); //機率
            int playernum = sc.nextInt(); //第幾個人
            
            double q = 1 - p;
            
            double numerator = p * Math.pow(q, playernum - 1); 
            double denominator = 1 - Math.pow(q, player); //至少一人會中 → 遊戲結束的期望條件
            double result = numerator / denominator;

            System.out.printf("%.4f\n", result);
        }
    }
    
}
