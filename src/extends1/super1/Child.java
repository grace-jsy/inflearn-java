package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println( "Hello from Child");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this = 자기 자신
        System.out.println("super value = " + super.value); // super = 부모

        this.hello();
        super.hello();
    }
}
