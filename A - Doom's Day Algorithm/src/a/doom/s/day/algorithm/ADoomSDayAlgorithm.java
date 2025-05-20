/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.doom.s.day.algorithm;

import java.util.*;
public class ADoomSDayAlgorithm {
    public static void main(String[] args) {
        String[] week = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] doomsday = { 0, 10, 21, 7, 4, 9, 6, 11, 8, 5, 10, 7, 12};
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int diff = b - doomsday[a];
            int dayIndex = (0 + diff % 7 + 7) % 7;
            
            System.out.println(week[dayIndex]);
        }
    }
}
