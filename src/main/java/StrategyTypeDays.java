abstract class StrategyTypeDays implements StrategySlope {

    StrategySlope slope;

    StrategyTypeDays(KindSkiPass ksp, Date today) {
        switch (ksp.skipass_type()) {
            case "day": {
                slope = new SlopeForDays(ksp, today);
                break;
            }
            case "hoist": {
                slope = new SlopeForRides(ksp, today);
                break;
            }
            default:
                slope = new SlopeForRides(ksp, today);
        }
    }

    @Override
    public boolean can_go_up(Date today) {
        return slope.can_go_up(today);
    }

    @Override
    public String end_skipass() {
        return slope.end_skipass();
    }

    public void minus() {
        slope.minus();
    }

    public abstract boolean can_lift(Date today);

    public int getSkiPassID() {
        return slope.getSkiPassID();
    }


}
