/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package back.to.high.school.physics;

import java.util.*;
public class BackToHighSchoolPhysics {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            int ans = 2 * v * t;
            System.out.println(ans);
        }
    }
}