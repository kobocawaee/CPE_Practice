/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmat.the.brave.warrior;
import java.util.*;
import java.math.BigInteger;
public class HashmatTheBraveWarrior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextBigInteger()){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.subtract(b).abs());
        }
    }
    
}
