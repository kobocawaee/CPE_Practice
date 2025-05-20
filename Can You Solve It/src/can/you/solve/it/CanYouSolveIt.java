/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package can.you.solve.it;

import java.util.*;
public class CanYouSolveIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            int y = Math.abs((x2 + y2) - (x1 + y1));
            int ysum = y * (y+1) / 2;
            
            int ans = ysum + (x2 - x1);
            
            System.out.println("Case " + i + ": " + ans);
        }
    }
}
