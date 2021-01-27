package lesson2;

import lesson2.myExeptions.MyArrayDataException;
import lesson2.myExeptions.MyArraySizeException;

import java.util.Random;

public class AppRun {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] badArray1 = new String[4][44];
        String[][] badArray2 = new String[4][4];
        String[][] goodArray = new String[4][4];
        for (int i = 0; i < goodArray.length; i++) {
            for (int j = 0; j < goodArray[i].length; j++) {
                goodArray[i][j] = String.valueOf(random.nextInt(500));
                badArray2[i][j] = String.valueOf(random.nextInt(500));
            }
        }
        badArray2[0][0] = "hz";

        try {
            checkArray(badArray1);
            System.out.println(additionElements(badArray1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }

        try {
            checkArray(badArray2);
            System.out.println(additionElements(badArray2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }

        try {
            checkArray(goodArray);
            System.out.println(additionElements(goodArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }
    }

    public static int additionElements(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (String[] strings : array) {
            for (String element : strings) {
                if (!Character.isDigit(element.charAt(0)))
                    throw new MyArrayDataException();
                sum += Integer.parseInt(element);
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
