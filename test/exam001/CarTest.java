package exam001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getTireBrandTest() {
        Car car = new Car();

        assertEquals("This Tire is get Korea tire!", car.getTireBrand());
    }


}