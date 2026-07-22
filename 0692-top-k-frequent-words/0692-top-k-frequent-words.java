class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> mp = new HashMap<>();

        int n = words.length;

        for(int i = 0; i < n; i++){
            mp.put(words[i], mp.getOrDefault(words[i], 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if (!mp.get(a).equals(mp.get(b))) {
                    return mp.get(b) - mp.get(a);
                }
                return a.compareTo(b);
            }
        );

        for(Map.Entry<String, Integer> tem : mp.entrySet()){
            pq.add(tem.getKey());
        }

        List<String> li = new ArrayList<>();
        
        for(int i = 0; i < k; i++){
            li.add(pq.poll());
        }
        return li;
    }
}