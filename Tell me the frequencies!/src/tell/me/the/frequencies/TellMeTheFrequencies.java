/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tell.me.the.frequencies;

import java.util.*;
public class TellMeTheFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean first = true;
        
        while(sc.hasNext()){
            String line = sc.nextLine();
            int[] num = new int[128];
            
            for(char c:line.toCharArray()){
                num[(int) c]++;
            }
            
            List<int[]> result = new ArrayList<>();
            for(int i=33; i<128; i++){
                if(num[i]>0){
                    result.add(new int[]{i, num[i]});
                }
            }
            
            result.sort((a,b)->{
                if (a[1] != b[1]){
                    return a[1] - b[1]; //一樣了話升序(由小到大)
                }
                return b[0] - a[0]; //否則ASCII值降序(由小到大)
            });
            
            if (!first) {
                System.out.println();
            } else {
                first = false;
            }

            for (int[] i : result) {
                System.out.println(i[0] + " " + i[1]);
            }
        }
    }
    
}
