public class SkiPassWeekends extends StrategyTypeDays {
    SkiPassWeekends(KindSkiPass ksp, Date today) {
        super(ksp, today);
        if (ksp.skipass_type().equals("subscription"))
            slope = new SlopeForSeason(ksp, today);

    }

    public boolean can_lift(Date today) {
        return today.getWeekday() > 4 && can_go_up(today);
    }
}
