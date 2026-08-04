class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);


        Set<Integer> st = new HashSet<>();
        List<Integer> li = new ArrayList<>();

        for(int val : nums){
            st.add(val);
        }

        int str = nums[0];
        int end = nums[nums.length - 1];

        for(int i = str; i < end; i++){
            if(!st.contains(i)) li.add(i);
        }
        return li;
    }
}