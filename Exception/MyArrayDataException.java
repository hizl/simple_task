package Exception;

public class MyArrayDataException extends IllegalArgumentException{

    private int array;
    private int number;


    public int getArray() {
        return array;
    }

    public int getNumber() {
        return number;
    }

    public MyArrayDataException(int[] array, int number) {
        super("large array size, it's wrong! ");
        this.array = array[number];
        this.number = number;
    }
}
