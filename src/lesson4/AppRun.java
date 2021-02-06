package lesson4;

import java.util.Arrays;

public class AppRun {

    public static void main(String[] args) {
        System.out.println("First task: " + Tasks.search(2, new int[]{5, 2, 6}));
        System.out.println("Second task: " + Tasks.reverse("java interview"));
        System.out.println("Third task:" + Tasks.maximum(new Integer[]{267, 55 , 6, 7, 8, 10, 998}));
        System.out.println("Fourth task: " + Tasks.average(Arrays.asList(267, 55, 6, 7, 8, 10, 998)));
        System.out.println("Fifth task: " + Tasks.search(Arrays.asList("asd", "string", "hz", "ananas",
                "aa", "azq", "banana")));
    }

}
