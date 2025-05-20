/*

*/
package satellites;

import java.util.*;
public class Satellites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 6440.0;
        
        while(sc.hasNext()){
            double h = sc.nextDouble();
            double a = sc.nextDouble();
            String unit = sc.next();
            
            if(unit.equals("min")){
                a /= 60.0; //分(min)換角度(deg)
            }
            
            double rad = Math.toRadians(a); //從角度變成弧度(這樣才能算sin跟cos)
            
            double s = r+h;
            
            double ans1 = s * rad; //弧長(圓形邊長)
            double ans2 = Math.sqrt(2.0 * Math.pow(s, 2.0) * (1 - Math.cos(rad))); //弦長(等腰三角形最長邊長度)
            
            System.out.printf("%.6f %.6f%n", ans1, ans2);
        }
    }
}
