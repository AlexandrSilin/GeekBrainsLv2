package lesson1.interfaces;

import lesson1.model.Barrier;

public interface Actions {
    boolean run(Barrier barrier);
    boolean jump(Barrier barrier);
}
