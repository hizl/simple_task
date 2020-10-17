package Exception;

public class Main {
    public static void main(String[] args) {

        String[] stringArray = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int[] array = new int[]{1,43,6, 2, 4, 5, 3};



        System.out.println(countingNumbersOrCatchException(array));
        System.out.println("String : " + countingString(stringArray));
        System.out.println(countingNumbersArraysNPE(array));
    }


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
                    throw new MyArraySizeException(rawString, i);
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
