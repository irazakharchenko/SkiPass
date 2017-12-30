public class FactoryWeekend implements Factory{
    @Override
    public SkiPassFather makeSkipass(KindSkiPass ksp) {
        return new SkiPassWeekend(ksp);
    }
}
