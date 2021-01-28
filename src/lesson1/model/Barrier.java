package lesson1.model;

public abstract class Barrier {
    private final float high;

    public Barrier(float high) {
        this.high = high;
    }

    public float getHigh() {
        return high;
    }
}
