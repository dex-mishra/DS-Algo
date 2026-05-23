
 import java.util.*;
 public class Overlap_Interval_Merge_Brute {
   

    // Function to merge overlapping intervals using brute force
    public List<List<Integer>> merge(int[][] intervals) {

        // Sort intervals based on starting point
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<List<Integer>> ans = new ArrayList<>();

        int n = intervals.length;
        int i = 0;

        // Loop through intervals
        while (i < n) {
            // Start of merged interval
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i + 1;

            // Check all overlapping intervals
            while (j < n && intervals[j][0] <= end) {
                // Extend the end of current interval
                end = Math.max(end, intervals[j][1]);
                j++;
            }

            // Add merged interval to result
            ans.add(Arrays.asList(start, end));

            // Move to next non-overlapping interval
            i = j;
        }

        return ans;
    }


public class Main {
    public static void main(String[] args) {
        Overlap_Interval_Merge_Brute sol = new Overlap_Interval_Merge_Brute();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> result = sol.merge(intervals);
        for (List<Integer> interval : result) {
            System.out.print(interval + " ");
        }
    }
}

}
