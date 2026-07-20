class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;


        List<List<Integer>> li = new ArrayList<>();
        for(int i = 0; i < n; i++){
            li.add(new ArrayList<>());
            for(int j = 0; j < m; j++){
                li.get(i).add(0);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int newPos = (i * m) + j + k;
                int row = newPos / m;
                int col = newPos % m;

                li.get(row % n).set((col % m), grid[i][j]);
            }
        }
        return li;
    }
}