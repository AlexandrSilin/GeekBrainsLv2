package lesson4;

import lesson4.interfaces.Average;
import lesson4.interfaces.FindMax;
import lesson4.interfaces.ReverseString;
import lesson4.interfaces.SearchIndex;

import java.util.List;
import java.util.stream.Collectors;

public class Tasks {

    public static String reverse(String s){
        ReverseString reverse;
        reverse = (String string) -> {
            StringBuilder out = new StringBuilder();
            for(int i = string.length() - 1; i >= 0; i--){
                out.append(string.charAt(i));
            }
            return out.toString();
        };
        return reverse.reverse(s);
    }

    public static int search(Integer element, int[] array){
        SearchIndex searchIndex = (Integer n, int[] list) -> {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == n) {
                    return i;
                }
            }
            return -1;
        };
        return searchIndex.search(element, array);
    }

    public static Integer maximum(Integer[] list){
        FindMax max = (Integer[] array) -> {
            int element = array[0];
            for (int tmp: array) {
                if (tmp > element)
                    element = tmp;
            }
            return element;
        };
        return max.maximum(list);
    }

    public static Double average(List<Integer> list){
        Average average = (List<Integer> array) ->{
            int sum = 0;
            for(Integer element : array){
                sum += element;
            }
            return (double) (sum / array.size());
        };
        return average.average(list);
    }

    public static List<String> search(List<String> strings){
        return strings.stream().filter(word -> word.length() == 3 && word.charAt(0) == 'a')
                .collect(Collectors.toList());
    }
}
