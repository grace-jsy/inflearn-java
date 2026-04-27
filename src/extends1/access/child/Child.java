package extends1.access.child;

import extends1.access.parents.Parents;

public class Child extends Parents {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지이므로 가능 Accessible because of inheritance of being in the same package
        // defaultValue = 1; // 다른 패키지에 있기 때문에 접근 불가, 컴파일 오류 Not accessible due to being in a different package, resulting in a compilation error
        // privateValue = 1; // 접근 불가, 컴파일 오류 Not accessible, resulting in a compilation error

        publicMethod();
        protectedMethod();
        // defaultMethod(); Not accessible due to being in a different package, resulting in a compilation error
        // privateMethod(); Not accessible, resulting in a compilation error

        printParent();
    }
}
