/**
 * Harry Potter needs help identifying what each house means.
 * Read a string representing a house and output the following:
 * if it is "gryffindor", output "bravery";
 * if it is "hufflepuff", output "loyalty";
 * if it is "slytherin", output "cunning";
 * if it is "ravenclaw", output "intellect";
 * otherwise, output "not a valid house".
 * <p>
 * Sample Input 1:
 * <p>
 * gryffindor
 * Sample Output 1:
 * <p>
 * bravery
 */

package com.company.dev.ar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getHouses().getOrDefault(scanner.nextLine(), "not a valid house"));
    }

    static Map<String, String> getHouses() {
        Map<String, String> houses = new HashMap<>();
        houses.put("gryffindor", "bravery");
        houses.put("hufflepuff", "loyalty");
        houses.put("slytherin", "cunning");
        houses.put("ravenclaw", "intellect");
        return houses;
    }
}
