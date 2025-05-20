/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minesweeper;

import java.util.*;
public class Minesweeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fieldNum = 1;
        
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            
            if(n == 0 && m == 0){
                break;
            }
            
            char[][] field = new char[n][m];
            for(int i=0; i<n; i++){
                field[i] = sc.nextLine().toCharArray();
            }
            
            if (fieldNum > 1){
                System.out.println();// 不同地圖間空一行
            } 
            System.out.println("Field #" + fieldNum + ":");
            
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(field[i][j] == '*'){
                        System.out.print("*");
                    }
                    else{
                        int count = 0;
                        for (int dx = -1; dx <= 1; dx++) {
                            for (int dy = -1; dy <= 1; dy++) {
                                if (dx == 0 && dy == 0){
                                    continue; // 自己不要算
                                } 
                                int ni = i + dx;
                                int nj = j + dy;
                                if (ni >= 0 && ni < n && nj >= 0 && nj < m && field[ni][nj] == '*') {
                                    count++;
                                }
                            }
                        }
                        System.out.print(count);
                    }
                }
                System.out.println();
            }
            
            fieldNum++;
        }
    }
    
}
