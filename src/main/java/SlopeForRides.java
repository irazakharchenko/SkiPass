public class SlopeForRides implements StrategySlope{
    private SkiPass skiPass;
    private KindSkiPass kindSkiPass;
    private int slides_left;
    private Date date_start;

    public SlopeForRides(KindSkiPass ksp, Date date){
        kindSkiPass = ksp;
        date_start = date;
    }

    public int getSlides_left() {
        return slides_left;
    }

    @Override
    public boolean can_go_up(Date today) {
        return slides_left>0 && !skiPass.isBan() && today.equal(date_start);
    }

    @Override
    public String end_skipass() {
        return "You have "+ slides_left+ " slides left, till end of"+ date_start;
    }

    public void minus(){
        slides_left--;
    }

}
