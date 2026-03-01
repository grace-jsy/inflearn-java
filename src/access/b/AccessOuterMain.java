package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // Public
        data.publicField = 1;
        data.publicMethod();

        // Not accessible from outside the package
        // data.defaultField = 2;
        // data.defaultMethod();

        // Private
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}
