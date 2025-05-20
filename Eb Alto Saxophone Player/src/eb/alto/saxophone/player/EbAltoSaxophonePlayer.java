/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eb.alto.saxophone.player;

import java.util.*;
public class EbAltoSaxophonePlayer {
    static Map<Character, Set<Integer>> fingeringMap = new HashMap<>();

    static {
        fingeringMap.put('c', Set.of(2, 3, 4, 7, 8, 9, 10));
        fingeringMap.put('d', Set.of(2, 3, 4, 7, 8, 9));
        fingeringMap.put('e', Set.of(2, 3, 4, 7, 8));
        fingeringMap.put('f', Set.of(2, 3, 4, 7));
        fingeringMap.put('g', Set.of(2, 3, 4));
        fingeringMap.put('a', Set.of(2, 3));
        fingeringMap.put('b', Set.of(2));
        fingeringMap.put('C', Set.of(3));
        fingeringMap.put('D', Set.of(1, 2, 3, 4, 7, 8, 9));
        fingeringMap.put('E', Set.of(1, 2, 3, 4, 7, 8));
        fingeringMap.put('F', Set.of(1, 2, 3, 4, 7));
        fingeringMap.put('G', Set.of(1, 2, 3, 4));
        fingeringMap.put('A', Set.of(1, 2, 3));
        fingeringMap.put('B', Set.of(1, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());

        while (testCase-- > 0) {
            int[] pressCount = new int[10]; // 10 根手指的計數器
            String music = sc.nextLine();

            Set<Integer> lastPressed = new HashSet<>();

            for (char note : music.toCharArray()) {
                Set<Integer> currentPressed = fingeringMap.getOrDefault(note, new HashSet<>());

                for (int i = 1; i <= 10; i++) {
                    boolean isNowPressed = currentPressed.contains(i);
                    boolean wasPressed = lastPressed.contains(i);

                    if (isNowPressed && !wasPressed) {
                        pressCount[i - 1]++;
                    }
                }

                lastPressed = currentPressed;
            }

            for (int i = 0; i < 10; i++) {
                System.out.print(pressCount[i]);
                if (i != 9){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
