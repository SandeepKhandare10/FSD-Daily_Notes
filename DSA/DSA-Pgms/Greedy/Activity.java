package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Activity {
    int start;
    int end;

    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static class ActivitySelection {
        public static void activitySelection(Activity[] activities) {

            Arrays.sort(activities, new Comparator<Activity>() {
                @Override
                public int compare(Activity a1, Activity a2) {
                    return Integer.compare(a1.end, a2.end);
                }
            });

            for (int i = 0; i < activities.length; i++) {
                System.out.println(activities[i].start + " " + activities[i].end);

            }
        }
    }

    public static void main(String[] args) {
        Activity[] activities = {
                new Activity(5,6),
                new Activity(7,0),
                new Activity(1,5),
                new Activity(2,4)
        };

        ActivitySelection.activitySelection(activities);
    }
}
