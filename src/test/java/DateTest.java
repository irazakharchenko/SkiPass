import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateTest {
    private Date d = new Date(), d1 = new Date(1, 12, 2017);

    @Test
    public void before() throws Exception {
        assertEquals(true, d1.before(d));
        assertEquals(false, d.before(d1));
        assertEquals(true, d.before(d));
    }

}