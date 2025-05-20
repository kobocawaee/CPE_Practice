/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largest.square;

import java.util.*;
public class LargestSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int Q = sc.nextInt();
            sc.nextLine(); // consume newline

            char[][] grid = new char[M][N];
            for (int i = 0; i < M; i++) {
                grid[i] = sc.nextLine().toCharArray();
            }

            System.out.println(M + " " + N + " " + Q);

            for (int q = 0; q < Q; q++) {
                int r = sc.nextInt();
                int c = sc.nextInt();
                char centerChar = grid[r][c];
                int maxSize = 1;

                for (int k = 1; ; k++) {
                    int top = r - k, bottom = r + k;
                    int left = c - k, right = c + k;

                    if (top < 0 || bottom >= M || left < 0 || right >= N) break;

                    boolean allMatch = true;
                    for (int i = top; i <= bottom; i++) {
                        if (grid[i][left] != centerChar || grid[i][right] != centerChar) {
                            allMatch = false;
                            break;
                        }
                    }
                    for (int j = left + 1; j < right; j++) {
                        if (grid[top][j] != centerChar || grid[bottom][j] != centerChar) {
                            allMatch = false;
                            break;
                        }
                    }

                    if (allMatch) {
                        maxSize = 2 * k + 1;
                    } else {
                        break;
                    }
                }

                System.out.println(maxSize);
            }
        }
    }
    
}
