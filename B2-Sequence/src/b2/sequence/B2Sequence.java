/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2.sequence;

import java.util.*;
public class B2Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            int n = Integer.parseInt(line);

            if (!sc.hasNextLine()) break;
            String[] parts = sc.nextLine().trim().split("\\s+");
            int[] arr = new int[n];

            boolean isB2 = true;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
                if (arr[i] <= 0 || (i > 0 && arr[i] <= arr[i - 1])) {
                    isB2 = false; // 非遞增 或 非正數
                }
            }

            Set<Integer> sums = new HashSet<>();
            outer:
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int sum = arr[i] + arr[j];
                    if (sums.contains(sum)) {
                        isB2 = false;
                        break outer;
                    }
                    sums.add(sum);
                }
            }

            System.out.println("Case #" + caseNum + ": " +
                    (isB2 ? "It is a B2-Sequence." : "It is not a B2-Sequence."));
            System.out.println();
            caseNum++;
        }
    }
    
}
