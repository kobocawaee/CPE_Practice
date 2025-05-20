/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cheapest.base;

import java.util.*;
public class CheapestBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int caseNum = 1; caseNum <= T; caseNum++) {
            int[] cost = new int[36];
            int idx = 0;

            // 讀取4行共36個字元的成本
            while (idx < 36) {
                String[] line = sc.nextLine().trim().split("\\s+");
                for (String val : line) {
                    cost[idx++] = Integer.parseInt(val);
                }
            }

            int n = Integer.parseInt(sc.nextLine());
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Case " + caseNum + ":");

            for (int num : numbers) {
                int minCost = Integer.MAX_VALUE;
                List<Integer> bases = new ArrayList<>();

                for (int base = 2; base <= 36; base++) {
                    int temp = num;
                    int costSum = 0;

                    if (temp == 0) {
                        costSum = cost[0]; // 單一 '0' 的成本
                    } else {
                        while (temp > 0) {
                            int digit = temp % base;
                            costSum += cost[digit];
                            temp /= base;
                        }
                    }

                    if (costSum < minCost) {
                        minCost = costSum;
                        bases.clear();
                        bases.add(base);
                    } else if (costSum == minCost) {
                        bases.add(base);
                    }
                }

                // 輸出格式
                System.out.print("Cheapest base(s) for number " + num + ":");
                for (int b : bases) {
                    System.out.print(" " + b);
                }
                System.out.println();
            }

            System.out.println(); // 每組 case 中間空行
        }
    }
}
