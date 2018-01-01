class Turnstile {
    private Date today = new Date();

    Date getToday() {
        return today;
    }

    void setToday(Date today) {
        this.today = today;
    }

    private boolean canMove(StrategyTypeDays std) {
        return std.can_lift(today);
    }

    boolean want_go(StrategyTypeDays std) {
        if (canMove(std)) {
            std.minus();
            System.out.println("Congratulations!");
            System.out.println(std.end_skipass());
            return true;
        } else
            System.out.println("You can't go sorry.");
        return false;
    }
}
