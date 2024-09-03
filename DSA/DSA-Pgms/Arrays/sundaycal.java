package Arrays;

public class sundaycal {
    public static void main(String[] args) {
        // sun=0,mon=1,..sat=6
        int start_day = 6;
        int total_days = 2;
        int fday=total_days+start_day;
        int sundays = 0;

        for (int i = start_day; i <= fday; i++) {
            if (i % 7 == 1) {
                sundays++;
            }
        }

        System.out.println(sundays);
    }
}
