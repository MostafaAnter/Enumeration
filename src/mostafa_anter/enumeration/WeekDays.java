package mostafa_anter.enumeration;

/**
 * Created by mostafa on 19/06/16.
 */
public enum  WeekDays {
    MONDAY(0), TUESDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4), SATURDAY(5);

    private int dayNum;
    private WeekDays(int day){
        this.dayNum = day;
    }


    @Override
    public String toString() {
        return String.valueOf(dayNum);
    }
}
