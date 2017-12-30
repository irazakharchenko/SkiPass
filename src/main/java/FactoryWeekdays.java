public class FactoryWeekdays implements Factory{
    @Override
    public SkiPass makeSkipass(KindSkiPass ksp) {
        return new SkiPassWeekend(ksp);
    }
}
