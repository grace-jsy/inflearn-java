package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. Call static");
        DecoData.staticCall();

        System.out.println("2. Call instance1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. Call instance2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
