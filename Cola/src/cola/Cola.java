/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola;

import java.util.*;
public class Cola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0){
                break;
            }

            int total = n;
            int empty = n;

            while (empty >= 3) {
                int newCola = empty / 3;
                total += newCola;
                empty = newCola + (empty % 3);
            }

            // 如果剩 2 瓶，可以借一瓶再換一次
            if (empty == 2) {
                total += 1;
            }

            System.out.println(total);
        }
    }
    
}
