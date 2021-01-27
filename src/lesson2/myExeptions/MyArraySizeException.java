package lesson2.myExeptions;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(){
        super("Size of array must be 4x4");
    }
}
