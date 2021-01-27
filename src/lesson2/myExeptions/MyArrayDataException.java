package lesson2.myExeptions;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(){
        super("Illegal character(s) in string");
    }
}
