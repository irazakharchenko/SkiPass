public class SkiPassWeekends extends StrategyTypeDays {
    public SkiPassWeekends(KindSkiPass ksp, Date today) {
        super(ksp, today);
        if(ksp.skipass_type().equals("subscription"))
            slope = new SlopeForSeason(ksp,today);

    }


}
