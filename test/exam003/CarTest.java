package exam003;

import di.exam003.AmericaTire;
import di.exam003.Car;
import di.exam003.KoreaTire;
import di.exam003.Tire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getKoreaTireBrand() {
        Tire tire = new KoreaTire();
        Car car = new Car();
        car.setTire(tire);

        assertEquals("This tire is get Korea tire!", car.getTireBrand());
    }

    @Test
    void getAmericaTireBrand(){
        Tire tire = new AmericaTire();
        Car car = new Car();
        car.setTire(tire);
        assertEquals("This tire is get America tire!", car.getTireBrand());
    }
}