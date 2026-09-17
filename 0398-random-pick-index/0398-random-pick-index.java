class Solution {
    Map<Integer, List<Integer>> mp;
    public Solution(int[] nums) {
        int n = nums.length;

        mp = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], new ArrayList<>());
            }

            mp.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> li = mp.get(target);

        int index = (int) (Math.random() * li.size());

        return li.get(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */