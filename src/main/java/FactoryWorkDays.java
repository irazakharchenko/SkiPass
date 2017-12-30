public class FactoryWorkDays implements  Factory{

    @Override
    public SkiPassFather makeSkipass(KindSkiPass ksp) {
        return new SkiPassWorkDays(ksp) ;
    }
}
