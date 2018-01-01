import org.junit.Test;

import static org.junit.Assert.*;

public class StrategyTypeDaysTest {
    private Date date = new Date(1,1,2018);
    private StrategyTypeDays std = new SkiPassWorkDays(KindSkiPass.HOISTS10,date );
    @Test
    public void end_skipass() throws Exception {
        assertEquals("You have 10 slides left, till end of 1/1/2018",std.end_skipass());
    }

}