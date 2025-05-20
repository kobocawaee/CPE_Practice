/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package common.permutation;

import java.util.*;
public class CommonPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String a = sc.nextLine();
            if (!sc.hasNextLine()) break;
            String b = sc.nextLine();
            
            char[] ans = new char[26];
            int count = 0;
            if(a.length() < b.length()){
                for(char i:a.toCharArray()){
                    String s = new String(ans, 0, count);
                    if(b.indexOf(i)>=0 && s.indexOf(i) == -1){
                        ans[count] = i;
                        count++;
                    }
                }
            }
            else{
                for(char i:b.toCharArray()){
                    String s = new String(ans, 0, count);
                    if(a.indexOf(i)>=0 && s.indexOf(i) == -1){
                        ans[count] = i;
                        count++;
                    }
                }
            }
            Arrays.sort(ans, 0, count);
            for(char i:ans){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
