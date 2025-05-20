/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package square.numbers;

import java.util.*;
public class SquareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a==0 && b==0){
                break;
            }
            
            int lower = (int) Math.ceil(Math.sqrt(a));
            int upper = (int) Math.floor(Math.sqrt(b));

            int count = upper - lower + 1;
            if (count < 0){
                count = 0;
            }

            System.out.println(count);
        }
    }
    
}
