package static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo");
        Car car2 = new Car("XC60");
        Car car3 = new Car("Model Y");

        Car.showTotalCars();
    }
}
