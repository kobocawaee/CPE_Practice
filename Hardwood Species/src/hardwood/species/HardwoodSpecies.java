/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hardwood.species;

import java.util.*;
public class HardwoodSpecies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        
        for(int t=0; t<testCases; t++){
            Map<String, Integer> map = new TreeMap<>();
            int totalTrees = 0;
            
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.isEmpty()){
                    break;
                }
                
                map.put(line, map.getOrDefault(line, 0) +1); //等價於下面這個指令
                /*
                if (map.containsKey(line)) {
                    map.put(line, map.get(line) + 1); // 如果已經出現過，次數+1
                } 
                else {
                    map.put(line, 1); // 第一次出現，設為1
                }
                */
                totalTrees++;
            }
            
            for(String tree : map.keySet()){
                double percent = (map.get(tree) * 100.0) / totalTrees;
                System.out.printf("%s %.4f%n", tree, percent);
            }
            
            if(t < testCases - 1){
                System.out.println();
            }
        }
    }
    
}
