package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); // 매개변수가 없는 기본 생성자는 생략 가능
        System.out.println("ClassB's constructor a = " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB's constructor a = " + a + " b = " + b);
    }
}
