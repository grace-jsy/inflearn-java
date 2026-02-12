package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null; // NullPointerException occurs
        data.value = 10;
        System.out.println("data = " + data.value);
    }
}
