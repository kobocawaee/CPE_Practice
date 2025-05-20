/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package all.you.need.is.love;

import java.util.*;
public class AllYouNeedIsLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i=1; i<=n; i++){
            String s1 = sc.nextLine();  // 第一個 binary 字串
            String s2 = sc.nextLine();  // 第二個 binary 字串

            int num1 = Integer.parseInt(s1, 2);  // 二進位轉十進位
            int num2 = Integer.parseInt(s2, 2);

            int gcd = gcd(num1, num2);  // 計算 GCD

            // 輸出結果
            if (gcd > 1) {
                System.out.println("Pair #" + i + ": All you need is love!");
            } else {
                System.out.println("Pair #" + i + ": Love is not all you need!");
            }
        }
    }
    
    public static int gcd(int a, int b) {
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
