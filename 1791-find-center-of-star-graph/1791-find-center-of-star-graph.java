class Solution {
    public int findCenter(int[][] edges) {
        int rows=edges.length;
        int cols=edges[0].length;
            for(int j=1; j<rows; j++){
                if(edges[0][0]==edges[j][0]){
                    return edges[0][0];
                } if(edges[0][1]==edges[j][1]){
                    return edges[0][1];
                }
            }
        return 0;
    }
}