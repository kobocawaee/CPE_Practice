/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simply.emirp;

import java.util.*;
public class SimplyEmirp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int n = sc.nextInt();
            
            if(!isPrime(n)){
                System.out.println(n + " is not prime.");
            }
            else {
                int reversed = reverse(n);
                if (reversed != n && isPrime(reversed)) {
                    System.out.println(n + " is emirp.");
                } else {
                    System.out.println(n + " is prime.");
                }
            }

        }
    }
    
    public static boolean isPrime(int n) {
        if (n < 2){
            return false;
        }
        if (n == 2){
            return true;
        }
        if (n % 2 == 0){
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
