package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        method1(10);
        System.out.println("Main ends");

    }

    static void method1(int m1) {
        System.out.println("method1 starts");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 ends");
    }

    static void method2(int m2) {
        System.out.println("Method2 starts");
        System.out.println("Method2 ends");
    }
}
