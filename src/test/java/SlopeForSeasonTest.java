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
        assertEquals("You can slide till " + d1, ss.end_skipass());
    }

}