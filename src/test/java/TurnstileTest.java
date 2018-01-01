import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class TurnstileTest {
    Date date = new Date(6, 1, 2018);
    FactorySkiPass fw = new FactorySkiPass();
    Turnstile t = new Turnstile();


    @Test
    public void want_go() {
        t.setToday(date);
        StrategyTypeDays std = fw.makeSkipass(true, "day",2, t.getToday());
        assertEquals( true,t.want_go(std));
        t.setToday(new Date(8,1,2018));
        assertEquals(false, t.want_go(std));
    }

}