/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jolly.jumpers;

import java.util.*;
public class JollyJumpers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.isEmpty()){
                continue;
            }
            
            String[] printin = line.split(" ");
            int n = Integer.parseInt(printin[0]);
            
            int[] nums = new int[n];
            for(int i=0; i<n; i++){
                nums[i] = Integer.parseInt(printin[i+1]);
            }
            
            boolean[] seen = new boolean[n];
            seen[0] = true;
            for(int i=1; i<n; i++){
                int check = Math.abs(nums[i] - nums[i-1]);
                if(check >= 1 && check < n){
                    seen[check] = !seen[check];
                }
                else{
                    seen[0] = false;
                    break;
                }
            }
            
            boolean jolly = true;
            if(!seen[0]){
                System.out.println("Not jolly");
            }
            else{
                for(boolean i:seen){
                    if(!i){
                        jolly=false;
                        break;
                    }
                }
                System.out.println(jolly ? "Jolly" : "Not jolly");
            }
        }
    }
    
}
