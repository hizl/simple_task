package Exception;

public class MyArraySizeException extends NullPointerException {
    private int array;
    private int incorrectNumber;




    public MyArraySizeException(int[] array, int correctNumber) {
        super(correctNumber+ " wrong data " + array[correctNumber]);
        this.array = array[correctNumber];
        this.incorrectNumber = correctNumber;
    }
}
