/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotating.sentences;

import java.util.*;
public class RotatingSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        int maxLen = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            lines.add(line);
            if (line.trim().isEmpty()) break;
            if (line.length() > maxLen) {
                maxLen = line.length();
            }
        }

        int rows = lines.size();
        int cols = maxLen;

        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = lines.get(i);
            for (int j = 0; j < cols; j++) {
                if (j < line.length()) {
                    matrix[i][j] = line.charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        for (int col = 0; col < cols; col++) {
            for (int row = rows - 1; row >= 0; row--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
    
}
