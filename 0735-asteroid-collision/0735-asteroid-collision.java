class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        int n = asteroids.length;

        for(int i = 0; i < n; i++){
            int val = asteroids[i];
            boolean isDestroyed = false;

            while(!st.isEmpty() && st.peek() > 0 && val < 0){

                if(st.peek() < -val){
                    st.pop();
                }else if(st.peek() == -val){
                    isDestroyed = true;
                    st.pop();
                    break;
                }else{
                    isDestroyed = true;
                    break;
                }
            }
            if(!isDestroyed){
                st.push(val);
            }
            
        }

        n  = st.size();

        int[] res = new int[n];
        int j = n - 1;

        while(!st.isEmpty()){
            res[j--] = st.pop();
        }

        return res;
    }
}