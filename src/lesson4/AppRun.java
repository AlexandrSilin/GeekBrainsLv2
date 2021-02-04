package lesson4;

import lesson4.interfaces.Average;
import lesson4.interfaces.FindMax;
import lesson4.interfaces.ReverseString;
import lesson4.interfaces.SearchIndex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppRun {

    public static void main(String[] args) {
        System.out.println("First task: " + search(2, new int[]{5, 2, 6}));
        System.out.println("Second task: " + reverse("java interview"));
        System.out.println("Third task:" + maximum(new Integer[]{267, 55 , 6, 7, 8, 10, 998}));
        System.out.println("Fourth task: " + average(Arrays.asList(267, 55, 6, 7, 8, 10, 998)));
        System.out.println("Fifth task: " + search(Arrays.asList("asd", "string", "hz", "ananas",
                "aa", "azq", "banana")));
    }

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
