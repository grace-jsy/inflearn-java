package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // Public
        data.publicField = 1;
        data.publicMethod();

        // Default
        data.defaultField = 2;
        data.defaultMethod();

        // Private
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}
