public class FactorySkiPass implements Factory{
    @Override
    public SkiPass makeSkipass(KindSkiPass ksp) {
        return new SkiPassWeekend(ksp);
    }
}
