class Solution {
    public int passThePillow(int n, int time) {
        int count=1;
        int currTime=0;
        int direction=1;
        while(currTime<time){
            if(count+direction>0 && count+direction<=n){
                count+= direction;
                currTime++;
            } else{
                direction *= -1;
            }
        }
        return count;
    }
}