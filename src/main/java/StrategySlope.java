public interface StrategySlope {
    boolean can_go_up(Date today);

    String end_skipass();

    void minus();
}
