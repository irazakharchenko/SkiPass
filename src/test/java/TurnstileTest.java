import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TurnstileTest {
    private Date date = new Date(6, 1, 2018);
    private FactorySkiPass fw = new FactorySkiPass();
    private Turnstile t = new Turnstile();


    @Test
    public void want_go() {
        t.setToday(date);
        StrategyTypeDays std = fw.makeSkipass(true, "day", 2, t.getToday());
        assertEquals(true, t.want_go(std));
        t.setToday(new Date(8, 1, 2018));
        assertEquals(false, t.want_go(std));
    }

}