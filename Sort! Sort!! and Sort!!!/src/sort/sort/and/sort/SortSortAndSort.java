/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sort.sort.and.sort;

import java.util.*;
public class SortSortAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            if (N == 0 && M == 0) break;

            Integer[] numbers = new Integer[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = sc.nextInt();
            }

            Arrays.sort(numbers, (a, b) -> {
                int modA = modCStyle(a, M);
                int modB = modCStyle(b, M);

                if (modA != modB)
                    return Integer.compare(modA, modB);

                boolean aOdd = a % 2 != 0;
                boolean bOdd = b % 2 != 0;

                if (aOdd && !bOdd)
                    return -1;
                if (!aOdd && bOdd)
                    return 1;

                if (aOdd && bOdd)
                    return Integer.compare(b, a); // 大的奇數在前
                if (!aOdd && !bOdd)
                    return Integer.compare(a, b); // 小的偶數在前

                return 0; // fallback
            });
            
            System.out.println(N + " " + M);
            for (int num : numbers) {
                System.out.println(num);
            }
        }
    }

    private static int modCStyle(int a, int m) {
        return a % m;
    }
}

