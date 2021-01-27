package lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(){
        super("Illegal character(s) in string");
    }
}
