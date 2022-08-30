package oop;

public class Car {
    String brand;
    String color;

    public Car(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public void move(){
        System.out.println("Car moves!");
    }

}
