class Solution {
    public boolean checkOverlap(int radius, int xC, int yC, int x1, int y1, int x2, int y2) {
        
        int xClosest = (xC < x1) ? x1 : (xC > x2) ? x2 : xC;
    
        int yClosest = (yC < y1) ? y1 : (yC > y2) ? y2 : yC;


        int distance = (int)(Math.pow ((xC - xClosest), 2) + Math.pow((yC - yClosest), 2));

        radius = radius * radius;

        return distance <= radius;
    }
}
