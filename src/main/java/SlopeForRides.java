public class SlopeForRides implements StrategySlope {

    private SkiPass skiPass;
    private KindSkiPass kindSkiPass;
    private int slides_left;
    private Date date_start;

    SlopeForRides(KindSkiPass ksp, Date date) {
        skiPass = new SkiPass();
        kindSkiPass = ksp;
        date_start = date;
        slides_left = ksp.toInt();
    }

    public int getSkiPassID() {
        return skiPass.getId();
    }

    int getSlides_left() {
        return slides_left;
    }

    @Override
    public boolean can_go_up(Date today) {
        return slides_left > 0 && !skiPass.isBan() && today.equal(date_start);
    }

    @Override
    public String end_skipass() {
        return "You have " + getSlides_left() + " slides left, till end of " + date_start;
    }

    public void minus() {
        slides_left--;
    }

}
