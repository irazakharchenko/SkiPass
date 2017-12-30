public class FactoryWorkDays implements  Factory{

    @Override
    public SkiPass makeSkipass(KindSkiPass ksp) {
        return new SkiPassWorkDays(ksp) ;
    }
}
