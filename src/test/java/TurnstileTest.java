import org.junit.Before;
import org.junit.Test;


class TurnstileTest {
    FactoryWeekend fw = new FactoryWeekend();
    Turnstile t = new Turnstile();


    @Test
    void want_go() {
        SkiPassFather sp = fw.makeSkipass(KindSkiPass.DAY1);
        t.want_go(sp);
    }

}