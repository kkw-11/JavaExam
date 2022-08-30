package exam001;

import di.exam001.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getTireBrandTest() {
        Car car = new Car();

        assertEquals("This tire is get Korea tire!", car.getTireBrand());
    }


}