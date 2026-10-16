class Solution {
    public double myPow(double x, int n) {
        
        // if(n==0){
        //     return 1;
        // }

        // if(n<0){
        //     return 1/myPow(x,-n);
        // }

        // return x * myPow(x,n-1); // stack overflow 

        long power = Math.abs((long) n);

        double ans = recursion(x,power);

        return n< 0 ? 1/ans : ans;
    }

    public double recursion(double x,long n){

        if(n==0){
            return 1;
        }

        double temp = recursion(x,n/2);

        if(n%2 == 0){
            return temp * temp;
        }

        return x * temp * temp;
    }
}