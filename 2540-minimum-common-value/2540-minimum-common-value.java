class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Set<Integer> st = new HashSet<>();

        for(int i = 0; i < n; i++){
            st.add(nums1[i]);
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < m; i++){
            if(st.contains(nums2[i])) min = Math.min(min, nums2[i]);
        }

        return (min != Integer.MAX_VALUE)? min : -1;
    }
}