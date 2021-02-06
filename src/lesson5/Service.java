package lesson5;

public class Service {
    static final int size = 10000000;
    static final int h = size / 2;

    private static float[] getArray(){
        float[] arr = new float[size];
        for (int i = 0; i < size; i++){
            arr[i] = 1;
        }
        return arr;
    }

    public static void oneThread(){
        float[] arr = getArray();
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("With one thread time in mills: " + (System.currentTimeMillis() - a));
    }

    public static void twoThreads(){
        float[] arr = getArray();
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.out.println("With two threads time in mills: " + (System.currentTimeMillis() - a));
    }
}
