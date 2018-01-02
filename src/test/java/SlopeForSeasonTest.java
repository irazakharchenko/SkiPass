import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlopeForSeasonTest {
    private Date d = new Date(), d1;
    private SlopeForSeason ss = new SlopeForSeason(KindSkiPass.SUBSCRIPTION, d),
            s = new SlopeForSeason(KindSkiPass.SUBSCRIPTION, d);

    @Test
    public void end_skipass() throws Exception {
        d1 = d.add_season();
        assertEquals("You can slide till " + d1, ss.end_skipass());
        ss.minus();
        // if we run all tests ID will be 13 and 14 if only this one, 0 and 1
        assertEquals(true, 13 <= ss.getSkiPassID() || ss.getSkiPassID() == 0);
        assertEquals(true, s.getSkiPassID()>-1);
    }

}