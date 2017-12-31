import java.util.ArrayList;

public class FactorySkiPass {
    private ArrayList<SkiPass> mass = new ArrayList<>();

    public FactorySkiPass() {

    }

    public StrategyTypeDays makeSkipass(boolean weekends, String type_sp, int number, Date today) {
        KindSkiPass ksp;
        switch (type_sp) {
            case "day": {
                switch (number) {
                    case 1: {
                        ksp = KindSkiPass.DAY1;
                        break;
                    }
                    case 2: {
                        ksp = KindSkiPass.DAYS2;
                        break;
                    }
                    case 5: {
                        ksp = KindSkiPass.DAYS5;
                        break;
                    }
                    default: {
                        ksp = KindSkiPass.DAY1;
                        break;
                    }
                }
                break;
            }
            case "ride": {
                switch (number) {
                    case 10: {
                        ksp = KindSkiPass.HOISTS10;
                        break;
                    }
                    case 20: {
                        ksp = KindSkiPass.HOISTS20;
                        break;
                    }
                    case 50: {
                        ksp = KindSkiPass.HOISTS50;
                        break;
                    }
                    case 100: {
                        ksp = KindSkiPass.HOISTS100;
                        break;
                    }
                    default: {
                        ksp = KindSkiPass.HOISTS10;
                        break;
                    }
                }
                break;
            }
            case "subscr": {
                ksp = KindSkiPass.SUBSCRIPTION;
                break;
            }
            default:{
                ksp = KindSkiPass.HOISTS10;
                break;
            }

        }
        if(weekends){
            return new SkiPassWeekends(ksp, today);
        }
        return new SkiPassWorkDays(ksp, today);
    }
}
