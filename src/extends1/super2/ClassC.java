package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        // super(); B에서 생성자를 정의했기 때문에 기본생성자 사용 불가
        super(10, 20);
        System.out.println("ClassC's constructor");
    }
}
