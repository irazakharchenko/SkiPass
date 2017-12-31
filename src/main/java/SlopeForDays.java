public class SlopeForDays implements  StrategySlope{
    private SkiPass skiPass;
    private KindSkiPass kindSkiPass;
    Date day_end ;
    public SlopeForDays(KindSkiPass ksp, Date today){
        skiPass = new SkiPass();
        kindSkiPass = ksp;
        day_end = today.add_day(ksp.toInt());
    }

    @Override
    public boolean can_go_up(Date today) {
        return !skiPass.isBan() && today.before(day_end);
    }


    @Override
    public String end_skipass() {
        return "You can slide till " + day_end.toString();
    }

    @Override
    public void minus() {

    }
}
