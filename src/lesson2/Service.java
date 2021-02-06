package lesson2.myExeptions;

public class Service {
    private static int tryToSum(String element, int i,  int j) throws MyArrayDataException {
        int number;
        try{
            number = Integer.parseInt(element);
        } catch (NumberFormatException e){
            throw new MyArrayDataException("Illegal format at [" + i + "][" + j +"]");
        }
        return number;
    }

    public static int additionElements(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                try {
                    sum += tryToSum(array[i][j], i, j);
                } catch (MyArrayDataException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        return sum;
    }

    public static void checkArray(String[][] array) throws MyArraySizeException{
        if (array.length > 4) {
            throw new MyArraySizeException();
        }
        for (String[] strings : array) {
            if (strings.length > 4) {
                throw new MyArraySizeException();
            }
        }
        System.out.println("Ok");
    }
}
