class Solution {
    public boolean checkGoodInteger(int n) {
        long sum =0;
        long squareSum=0; 
        
        while(n>0){
            int digit = n%10;

            sum += (long) digit;
            squareSum += (long)(digit*digit);

            n = n/10;
        }

        if(squareSum - sum >= 50){
            return true;
        }

        return false;
    }
}