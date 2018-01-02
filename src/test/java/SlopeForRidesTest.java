import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlopeForRidesTest {
    private Date d = new Date();
    private SlopeForRides sr = new SlopeForRides(KindSkiPass.HOISTS10, d);

    @Test
    public void getSlides_left() throws Exception {
        assertEquals(10, sr.getSlides_left());
    }

}