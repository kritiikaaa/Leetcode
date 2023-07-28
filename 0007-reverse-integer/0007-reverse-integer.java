class Solution {
    public int reverse(int x) {
        double  r=0; 
        
        
        while(x!=0)
        {
            int d=x%10;
            r=r*10+d;
            x=x/10;
        }
        if(r>=-(Math.pow(2,31))&&r<=((Math.pow(2,31))-1))
        {
        return (int)r;
        }
        else 
        return 0;
    }
}