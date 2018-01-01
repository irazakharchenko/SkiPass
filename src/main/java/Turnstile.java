public class Turnstile {
    private Date today = new Date();

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    private boolean canMove(StrategyTypeDays std) {
        return std.can_lift(today);
    }

    public boolean want_go(StrategyTypeDays std) {
        if (canMove(std)) {
            std.minus();
            System.out.println("Congratulations!");
            return true;
        } else
            System.out.println("You can't go sorry.");
        return false;
    }
}
