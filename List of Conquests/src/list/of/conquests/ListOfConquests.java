/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list.of.conquests;

import java.util.*;
public class ListOfConquests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> countryCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ", 2);
            String country = parts[0];

            countryCount.put(country, countryCount.getOrDefault(country, 0) + 1);
        }

        List<String> countries = new ArrayList<>(countryCount.keySet());
        Collections.sort(countries);

        for (String country : countries) {
            System.out.println(country + " " + countryCount.get(country));
        }
    }
    
}
