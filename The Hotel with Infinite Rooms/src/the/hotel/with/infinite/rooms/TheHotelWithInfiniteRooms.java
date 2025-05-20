/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package the.hotel.with.infinite.rooms;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TheHotelWithInfiniteRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            long num = sc.nextInt();
            long day = sc.nextInt();
            
            long groupSize = num;
            long currentDay = 1;

            while (true) {
                long stayLength = groupSize;

                // 若 D 落在這一組的範圍內
                if (day >= currentDay && day < currentDay + stayLength) {
                    System.out.println(groupSize);
                    break;
                }

                // 否則前進到下一組
                currentDay += stayLength;
                groupSize++;
            }
        }
    }
}

/*
import java.util.*;
public class BackToHighSchoolPhysics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            long num = sc.nextInt();
            long day = sc.nextInt();
            
            while(day>num){
                day-=num;
                num+=1;
            }
            
            System.out.println(num);
        }
        
    }
}
*/
