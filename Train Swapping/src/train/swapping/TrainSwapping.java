/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package train.swapping;

import java.util.*;
public class TrainSwapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int t = 0; t<n; t++){
            int num = sc.nextInt();
            int [] numbers = new int[num];
            
            for(int i=0; i<num; i++){
                numbers[i] = sc.nextInt();
            }
            
            int ans = SwapCount(numbers);
            System.out.println("Optimal train swapping takes " + ans + " swaps.");
        }
    }
    
    public static int SwapCount(int[] arr){
        int ans = 0;
        int n = arr.length;
        
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    ans++;
                }
            }
        }
        
        return ans;
    }
    
}
