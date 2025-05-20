/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.mid.summer.night.s.dream;

import java.util.*;
public class AMidSummerNightSDream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) continue;
            
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            Arrays.sort(nums);
            int median1 = nums[(n - 1) / 2];
            int median2 = nums[n / 2];

            int count = 0;
            for (int num : nums) {
                if (num == median1) count++;
            }

            int ways;
            if (median1 == median2){
                ways = 1;
            }
            else{
                ways = median2 - median1 + 1;
            }

            System.out.println(median1 + " " + count + " " + ways);
        }
    }
    
}
