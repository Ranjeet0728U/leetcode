class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        List<int[]> li = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] curArray = intervals[0];

        for(int i = 1; i < n; i++){

            if(curArray[1] >= intervals[i][0]){

                curArray[1] = Math.max(intervals[i][1], curArray[1]);
            }else{
                li.add(curArray);
                curArray = intervals[i];
            }
        }

        li.add(curArray);

        int liSize = li.size();

        int[][] ans = new int[liSize][2];
        int i = 0;

        for(int[] arr : li){
            
            ans[i][0] = arr[0];
            ans[i++][1] = arr[1];
        }

        return ans;
    }
}