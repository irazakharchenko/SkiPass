public class SkiPassWorkDays extends StrategyTypeDays {
    SkiPassWorkDays(KindSkiPass ksp, Date today) {
        super(ksp, today);

    }

    public boolean can_lift(Date today) {
        return today.getWeekday() < 5 && can_go_up(today);
    }


}
