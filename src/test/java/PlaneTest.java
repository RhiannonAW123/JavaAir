import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.DREAMLINER787);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.DREAMLINER787, plane.getType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(400, plane.getCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(1000, plane.getTotalWeight());
    }
}
