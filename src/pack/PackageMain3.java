package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();

        /*
            같은 이름의 클래스가 있다면 import는 둘 중 하나만 선택할 수 있다.
            이럴 경우, 자주 사용하는 클래스를 import하고 나머지를 패키지를 포함한 전체 경로를 적어주면 된다.
            If there are classes with the same name, you can import only one of them.
            In this case, you should import the class you use more frequently, and after refer to the other
            one by writing its fully qualified name (including the package path).
         */
    }
}
