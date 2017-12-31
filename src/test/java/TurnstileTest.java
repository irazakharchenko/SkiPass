import org.junit.Test;



class TurnstileTest {
    FactorySkiPass fw = new FactorySkiPass();
    Turnstile t = new Turnstile();


    @Test
    void want_go() {

        SkiPass sp = fw.makeSkipass(KindSkiPass.DAY1);
        t.want_go(sp);
    }

}