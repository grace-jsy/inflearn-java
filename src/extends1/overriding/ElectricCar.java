package extends1.overriding;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("An electric Car is moving faster.");
    }

    public void charge() {
        System.out.println("A car is charging.");
    }
}
