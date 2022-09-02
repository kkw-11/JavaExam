package oop;

public class CarEngineer {

    public static void main(String[] args) {

        Car car = new Car("Hyundai", "Black");

        System.out.println(car.brand);
        System.out.println(car.color);

        car.move();
    }
}
