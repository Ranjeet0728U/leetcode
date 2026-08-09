class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;

        List<int[]> li = new ArrayList<>();

        int i = 0;

        while(i < n && intervals[i][1] < newInterval[0]){
            li.add(intervals[i]);
            i++;
        }


        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        li.add(newInterval);

        while(i < n){
            li.add(intervals[i++]);
        }

        int size = li.size();

        int[][] ans = new int[size][2];
        i = 0;

        for(int[] arr : li){
            ans[i][0] = arr[0];
            ans[i][1] = arr[1];
            i++;
        }

        return ans;
    }
}