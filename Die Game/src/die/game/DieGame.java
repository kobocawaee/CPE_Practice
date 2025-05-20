/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package die.game;

import java.util.*;
public class DieGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = Integer.parseInt(sc.nextLine());
            if(n == 0){
                break;
            }
            
            int top = 1;
            int north = 2;
            int west = 3;
            int east = 4;
            int south = 5;
            int bottom = 6;
            
            for (int i = 0; i < n; i++) {
                String cmd = sc.nextLine();
                int temp;

                switch (cmd) {
                    case "north":
                        temp = top;
                        top = south;
                        south = bottom;
                        bottom = north;
                        north = temp;
                        break;
                    case "south":
                        temp = top;
                        top = north;
                        north = bottom;
                        bottom = south;
                        south = temp;
                        break;
                    case "east":
                        temp = top;
                        top = west;
                        west = bottom;
                        bottom = east;
                        east = temp;
                        break;
                    case "west":
                        temp = top;
                        top = east;
                        east = bottom;
                        bottom = west;
                        west = temp;
                        break;
                }
            }
            
            System.out.println(top);
        }
    }
    
}
