/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg498.bis;
import java.util.*;
public class Bis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            int x = Integer.parseInt(sc.nextLine().trim());
            String function = sc.nextLine();
            String[] num = function.split(" ");
            
            List<String> list = Arrays.asList(num);
            Collections.reverse(list);
            
            num = list.toArray(new String[0]);
            int[] num2 = new int[num.length-1];
            
            for(int i=1; i<num.length; i++){
                num2[i-1] = Integer.parseInt(num[i])*i;
            }
            
            int ans = 0;
            for(int i=0; i<num2.length; i++){
                ans+=num2[i]*Math.pow(x, i);
            }
            
            System.out.println(ans);
        }
    }
    
}
