package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data;
        data = 10;
        // data1 = 20 -> compile error

        final int data2 = 10;
        // data2 = 20; -> compile error

        method(10);
    }

    static void method(final int parameter) {
        // parameter = 20; -> compile error
    }
}
