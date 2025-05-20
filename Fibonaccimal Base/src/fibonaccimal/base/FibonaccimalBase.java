/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccimal.base;

import java.util.*;
public class FibonaccimalBase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // 預先建好所有不超過 100000000 的斐波那契數
        List<Integer> fibs = new ArrayList<>();
        fibs.add(1);  // F(1)
        fibs.add(2);  // F(2)
        while (true) {
            int next = fibs.get(fibs.size() - 1) + fibs.get(fibs.size() - 2);
            if (next > 100000000) break;
            fibs.add(next);
        }

        int n = sc.nextInt(); // 測資數
        while (n-- > 0) {
            int x = sc.nextInt();
            int original = x;
            StringBuilder fb = new StringBuilder();

            boolean started = false;
            for (int i = fibs.size() - 1; i >= 0; i--) {
                if (fibs.get(i) <= x) {
                    x -= fibs.get(i);
                    fb.append("1");
                    started = true;
                } else if (started) {
                    fb.append("0");
                }
            }

            System.out.println(original + " = " + fb + " (fib)");
        }

        sc.close();
    }
}