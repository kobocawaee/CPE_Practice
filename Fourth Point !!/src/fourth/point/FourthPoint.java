/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fourth.point;

import java.util.*;
public class FourthPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            double[] pts = new double[8];
            for (int i = 0; i < 8; i++) {
                pts[i] = sc.nextDouble();
            }

            // 四個點
            Point A = new Point(pts[0], pts[1]);
            Point B = new Point(pts[2], pts[3]);
            Point C = new Point(pts[4], pts[5]);
            Point D = new Point(pts[6], pts[7]);

            Point fourth = null;
            if (A.equals(C)) {
                fourth = vectorAdd(B, D, A);
            } 
            else if (A.equals(D)) {
                fourth = vectorAdd(B, C, A);
            } 
            else if (B.equals(C)) {
                fourth = vectorAdd(A, D, B);
            } 
            else if (B.equals(D)) {
                fourth = vectorAdd(A, C, B);
            }
            
            if (fourth != null) {
                System.out.printf("%.3f %.3f\n", fourth.x, fourth.y);
            } else {
                System.out.println("無法判斷共用點，請確認輸入");
            }
        }
    }//0 -1 1 0 
    public static Point vectorAdd(Point p1, Point p2, Point common) {
        double x = p1.x - common.x;
        double y = p1.y - common.y;
        return new Point(p2.x + x, p2.y + y);
    }

    static class Point {
        double x, y;
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Point p) {
            return Math.abs(this.x - p.x) < 1e-6 && Math.abs(this.y - p.y) < 1e-6;
        }
    }
}
