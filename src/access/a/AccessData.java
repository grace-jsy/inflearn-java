package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("Public Method = " + publicField);
    }

    void defaultMethod() {
        System.out.println("Default Method = " + defaultField);
    }

    private void privateMethod() {
        System.out.println("Private Method = " + privateField);
    }

    public void innerAccess() {
        System.out.println("Call Inner Access");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
