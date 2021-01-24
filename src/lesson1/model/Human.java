package lesson1.model;

import lesson1.interfaces.Actions;

public class Human implements Actions {
    private final String name;
    private final int runDistance;
    private final float jumpDistance;

    public Human(String name, int runDistance, float jumpDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public boolean run(Barrier barrier) {
        if (barrier.getHigh() > this.runDistance){
            System.out.println(this.name + " didn't pass treadmill (" + barrier.getHigh() + ")");
            return false;
        } else {
            System.out.println(this.name + " success passed treadmill (" + barrier.getHigh() + ")");
            return true;
        }
    }

    @Override
    public boolean jump(Barrier barrier) {
        if (barrier.getHigh() > this.jumpDistance){
            System.out.println(this.name + " didn't pass wall (" + barrier.getHigh() + ")");
            return false;
        } else {
            System.out.println(this.name + " success passed wall (" + barrier.getHigh() + ")");
            return true;
        }
    }
}