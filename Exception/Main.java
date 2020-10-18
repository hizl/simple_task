package Exception;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] stringArray = {
                {"1", "2", "3", "4",},
                {"5", "6", "7", "8"},
                {"9", "10", "3", "1"},
                {"9", "10", "3", "1"}
        };

        try {
            System.out.println(changeArrayFromTheString(stringArray));
        }catch (RootException e){
            System.out.println("wrong!");
        }
    }


    public static int changeArrayFromTheString(String[][] numbers) {
        if (numbers.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (numbers[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(numbers[i][j]);
                } catch (MyArrayDataException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;

    }


    //additional case
    public static int countingString(String[] arrayString) {
        int rawNumberSum = 0;
        int counting = 0;

        for (String array : arrayString) {
            counting = Integer.parseInt(array);
            rawNumberSum += counting;
        }
        return rawNumberSum;
    }


    public static int countingNumbersOrCatchException(int[] rawString) {
        int sum = 0;
        for (int rawNumber : rawString) {
            sum += rawNumber;
        }
        return sum;
    }

    public static int countingNumbersArraysNPE(int[] rawString) {
        int[] arrays = new int[10];
        int sum = 0;
        for (int i = 0; i < rawString.length; i++) {
            try {
                if (rawString[i] == 3) {
                    throw new MyArraySizeException();
                } else {
                    sum += rawString[i];
                }
            } catch (MyArraySizeException e) {
                rawString[i] = 1;

            }
        }
        return sum;
    }
}
