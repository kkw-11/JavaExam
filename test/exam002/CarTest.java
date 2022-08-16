package exam002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getKoreTireBrand() {
        Tire tire = new KoreaTire();
        Car car = new Car(tire);

        assertEquals("This tire is get Korea tire!", car.getTireBrand());
    }

    @Test
    void getAmericaTireBrand() {
        Tire tire = new AmericaTire();
        Car car = new Car(tire);

        assertEquals("This tire is get America tire!", car.getTireBrand());
    }
}