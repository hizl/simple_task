package Exception;

public class MyArrayDataException extends RootException{

    public MyArrayDataException() {
        super();
        System.out.println("check the data, the array is invalid! ");
    }
}
