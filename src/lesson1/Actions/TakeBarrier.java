package lesson1.Actions;

import lesson1.model.*;

public class TakeBarrier {
    public static void takeBarriers(Object participant, Barrier[] barriers){
        if (participant instanceof Human){
            for (Barrier barrier : barriers) {
                if (barrier instanceof Wall) {
                    if (!((Human)participant).jump(barrier))
                        break;
                }
                else if (barrier instanceof Treadmill)
                    if (!((Human)participant).run(barrier))
                        break;
            }
        }

        if (participant instanceof Cat){
            for (Barrier barrier : barriers) {
                if (barrier instanceof Wall) {
                    if (!((Cat)participant).jump(barrier))
                        break;
                }
                else if (barrier instanceof Treadmill)
                    if (!((Cat)participant).run(barrier))
                        break;
            }
        }

        if (participant instanceof Robot){
            for (Barrier barrier : barriers) {
                if (barrier instanceof Wall) {
                    if (!((Robot)participant).jump(barrier))
                        break;
                }
                else if (barrier instanceof Treadmill)
                    if (!((Robot)participant).run(barrier))
                        break;
            }
        }
    }
}
