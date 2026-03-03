package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("The amount must not exceed the maximum limit.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
