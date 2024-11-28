package bike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
    public void test_that_bike_is_on () {
        Bike bike = new Bike();
        bike.bikeIsOn(true);
        assertEquals(true, bike.bikeIsOn(true));
    }

     @Test
    public void test_that_bike_is_off () {
         Bike bike = new Bike();
         bike.bikeIsOn(true);
         bike.bikeIsOff(true);
         assertEquals(true, bike.bikeIsOff(true));
     }

     @Test
    public void test_that_bike_can_be_accelerated () {
        Bike bike = new Bike();
        bike.bikeIsOn(true);
        bike.isOnGearOne();

     }
}