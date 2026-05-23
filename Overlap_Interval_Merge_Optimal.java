import java.util.Arrays;

class Overlap_Interval_Merge_Optimal {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Pointer to track the position of the last valid merged interval
        int index = 0; 

        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the interval at 'index'
            if (intervals[i][0] <= intervals[index][1]) {
                // Merge them by updating the end time
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            } else {
                // Move the pointer forward and place the new interval there
                index++;
                intervals[index] = intervals[i];
            }
        }

        // Return only the valid portion of the array (from 0 to index)
        return Arrays.copyOf(intervals, index + 1);
    }
}
