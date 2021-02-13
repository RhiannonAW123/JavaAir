import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Ruby", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.FLIGHTATTENDANT, cabinCrew.getRank());
    }

    @Test
    public void canMakeAnnouncement(){
        assertEquals("Good morning flyers", cabinCrew.messageToPassengers("Good morning flyers"));
    }

}
