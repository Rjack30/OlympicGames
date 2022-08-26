package CustomException;

public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellTheTruthOkay() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are less crowded.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are most packed.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellTheTruthOkay();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellTheTruthOkay();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellTheTruthOkay();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellTheTruthOkay();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellTheTruthOkay();
    }
}
