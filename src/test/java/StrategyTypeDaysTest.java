import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrategyTypeDaysTest {
    private Date date = new Date(1, 1, 2018);
    private StrategyTypeDays std = new SkiPassWorkDays(KindSkiPass.HOISTS10, date),
            std1 = new SkiPassWeekends(KindSkiPass.DAY1, date);

    @Test
    public void end_skipass() throws Exception {
        assertEquals("You have 10 slides left, till end of 1/1/2018", std.end_skipass());
        // if we run all tests ID will be 12 and 13 if only this one, 0 and 1
        assertEquals(true, 14 == std.getSkiPassID() || std.getSkiPassID() == 0);
        assertEquals(true, 15 == std1.getSkiPassID() || std1.getSkiPassID() == 1);
        std.minus();
        assertEquals("You have 9 slides left, till end of 1/1/2018", std.end_skipass());

    }

}