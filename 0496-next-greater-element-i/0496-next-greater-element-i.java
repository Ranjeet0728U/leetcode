class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();

        int n1 = nums1.length;
        int n2 = nums2.length;

        for(int i = 0; i < n2; i++){
            while(!st.isEmpty() && nums2[i] > nums2[st.peek()]){
                mp.put(nums2[st.pop()], nums2[i]);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            mp.put(nums2[st.pop()] , -1);
        }

        int[] res = new int[n1];

        for(int i = 0; i < n1; i++){
            if(mp.containsKey(nums1[i])){
                res[i] = mp.get(nums1[i]);
            }
        }

        return res;
    }
}