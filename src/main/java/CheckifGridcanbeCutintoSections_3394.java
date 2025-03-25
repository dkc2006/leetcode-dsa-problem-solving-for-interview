class Solution {
    public boolean check(int[][] rectangles,int sortedWay){
        int coordinateGap = 0;
        Arrays.sort(rectangles,(a,b)->a[sortedWay]-b[sortedWay]);
        int end = rectangles[0][sortedWay+2];
        for(int i = 1;i<rectangles.length;i++){
            if(end<=rectangles[i][sortedWay]) coordinateGap++;
            end = Math.max(end,rectangles[i][sortedWay+2]);
        }
        return coordinateGap>=2;
    }
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return check(rectangles,0) || check(rectangles,1);
    }
}