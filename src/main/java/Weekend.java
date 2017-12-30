public enum Weekend {
    DAY1,DAYS2, HOISTS10, HOISTS20, HOISTS50, HOISTS100, SUBSCRIPTION;

    int toInt(){
        switch (this){
            case DAY1: return 1;
            case DAYS2: return 2;
            case HOISTS10: return 10;
            case HOISTS20: return 20;
            case HOISTS50: return 50;
            case HOISTS100: return 100;
            case SUBSCRIPTION: return 1000;
            default: return 10;
        }
    }

    String skipass_type(){
        switch (this){
            case DAY1: return "day";
            case DAYS2: return "day";
            case HOISTS10: return "hoist";
            case HOISTS20: return "hoist";
            case HOISTS50: return "hoist";
            case HOISTS100: return "hoist";
            case SUBSCRIPTION: return "subscription";
            default: return null;
        }
    }
}
