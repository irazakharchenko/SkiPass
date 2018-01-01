import org.junit.Test;

import static org.junit.Assert.*;

public class FactorySkiPassTest {
    FactorySkiPass fsp = new FactorySkiPass();
    Date date = new Date(6, 5,2018), date1;
    StrategyTypeDays sp;
    @Test
    public void makeSkipass() throws Exception {
        sp = fsp.makeSkipass(false, "day", 1, date);
        assertEquals(false, sp.can_lift(date));
        date1 = new Date(12, 2,2018);
        sp = fsp.makeSkipass(false, "day", 5, date1);
        assertEquals(false, sp.can_lift(date1));
        sp = fsp.makeSkipass(false, "day", 6, date1);
        assertEquals(false, sp.can_lift(date1));

        sp = fsp.makeSkipass(true, "ride", 6, date);
        assertEquals(true, sp.can_lift(date));
    }

}