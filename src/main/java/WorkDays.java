public enum WorkDays {
    DAY1,DAYS2, DAYS5, HOISTS10, HOISTS20, HOISTS50, HOISTS100;

    int toInt(){
        switch (this){
            case DAY1: return 1;
            case DAYS2: return 2;
            case DAYS5: return 5;
            case HOISTS10: return 10;
            case HOISTS20: return 20;
            case HOISTS50: return 50;
            case HOISTS100: return 100;
            default: return 10;
        }
    }

    String skipass_type(){
        switch (this){
            case DAY1: return "day";
            case DAYS2: return "day";
            case DAYS5: return "day";
            case HOISTS10: return "hoist";
            case HOISTS20: return "hoist";
            case HOISTS50: return "hoist";
            case HOISTS100: return "hoist";
            default: return null;
        }
    }

}
