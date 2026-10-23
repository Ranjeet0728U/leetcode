class Solution {
    void applyColor(int[][] image, int sr, int sc, int color, int srcColor){
        if(
            sr < 0 || sc < 0 ||
            sr >= image.length||
            sc >= image[0].length
        ) return;

        if(image[sr][sc] != srcColor) return;

        image[sr][sc] = color;

        applyColor(image, sr - 1, sc, color, srcColor);
        applyColor(image, sr + 1, sc, color, srcColor);
        applyColor(image, sr, sc - 1, color, srcColor);
        applyColor(image, sr, sc + 1, color, srcColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;

        if(image[sr][sc] == color) return image;


        applyColor(image, sr, sc, color, image[sr][sc]);
        return image;
    }
}