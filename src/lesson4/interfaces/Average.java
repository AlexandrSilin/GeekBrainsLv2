package lesson4.interfaces;

import java.util.List;

@FunctionalInterface
public interface Average {
    Double average(List<Integer> list);
}
