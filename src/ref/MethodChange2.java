package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("before method: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("after method: dataA.value = " + dataA.value);
    }

    public static void changeReference(Data dataX) {
        dataX.value = 20;
        // 메서드 안에서 dataX.value = 20으로 새로운 값을 대입한다.
    }
}
