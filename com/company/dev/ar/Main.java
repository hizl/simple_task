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

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        switch (str = scanner.nextLine()) {
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "hufflepuff":
                System.out.println("loyalty");
                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
                break;
        }
    }
}
