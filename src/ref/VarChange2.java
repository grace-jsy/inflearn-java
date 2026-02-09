package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA ref = " + dataA);
        System.out.println("dataB ref = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA change
        dataA.value = 20;
        System.out.println("change dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataB change
        dataA.value = 30;
        System.out.println("change dataA.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

    }
}
