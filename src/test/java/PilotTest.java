import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Amy",RankType.CAPTAIN, "FD45556");
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenseNumber(){
        assertEquals("FD45556", pilot.getLicenseNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("FLY THE GOD DAM PLANE!", pilot.flyPlane("FLY THE GOD DAM PLANE!"));

    }

}
