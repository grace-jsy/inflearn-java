package construct;

public class MemberDefault {
    String name;

    // default constructor
    MemberDefault() {

    }

    // 생성자는 반드시 호출되어야 한다.
    // A constructor must always be called.

    // 생성자가 없으면 기본 생성자가 제공된다.
    // If no constructor is defined, a default constructor is provided.

    // 생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다. 이 경우 개발자가 정의한 생성자를 직접 호출해야 한다.
    // If at least one constructor is defined, the default constructor is not provided.
    // In this case, the developer must explicitly call the defined constructor.
}
