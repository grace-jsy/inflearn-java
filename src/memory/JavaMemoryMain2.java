package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("Main starts");
        method1();
        System.out.println("Main ends");
    }

    static void method1() {
        System.out.println("Method1 starts");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("Method1 ends");
    }

    static void method2(Data data2) {
        System.out.println("Method2 starts");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("Method2 ends");
    }
}
