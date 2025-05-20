/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package symmetric.matrix;

import java.util.*;
public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for(int i=1; i<=T; i++){
            String line = sc.nextLine().trim();
            int n = Integer.parseInt(line.substring(4)); // "N = x" 取 x

            int[][] matrix = new int[n][n];
            for (int j = 0; j < n; j++) {
                //String[] parts = sc.nextLine().trim().split("\\s+");
                for (int k = 0; k < n; k++) {
                    //matrix[j][k] = Integer.parseInt(parts[k]);
                    matrix[j][k] = sc.nextInt();
                }
                sc.nextLine();
            }
            
            boolean symmetric = true;

            outer:
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    // 非負 & 對稱檢查
                    if (matrix[j][k] < 0 || matrix[j][k] != matrix[n - 1 - j][n - 1 - k]) {
                        symmetric = false;
                        break outer;
                    }
                }
            }

            String result = symmetric ? "Symmetric." : "Non-symmetric.";
            System.out.println("Test #" + i + ": " + result);
        }
    }
    
}
