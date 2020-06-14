package lesson.Array;

import java.util.Scanner;

public class LessonOne {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Please, enter five numbers elements arrays ");

        // from j = 0 , to j < array.length
        for (int j = 0; j < array.length; j++) {
            System.out.println("Next element : ");
            array[j] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Your number is " + i + " = " + array[i]);
        }
    }
}
