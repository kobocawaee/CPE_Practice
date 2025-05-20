/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divide.but.not.quite.conquer;

import java.util.*;
public class DivideButNotQuiteConquer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            boolean check = true;
            List<Integer> ans = new ArrayList<>();
            
            while(num1!=1){
                if(num1!=1 && num1%num2!=0){
                    check = false;
                    break;
                }
                ans.add(num1);
                num1/=num2;
            }
            
            if(check){
                for(int i:ans){
                    System.out.print(i+" ");
                }
                
                System.out.println(1);
            }
            else{
                System.out.println("Boring!");
            }
        }
    }
    
}
