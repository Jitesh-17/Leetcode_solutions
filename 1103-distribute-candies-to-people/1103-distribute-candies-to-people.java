class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int []arr = new int[num_people];
        int dist = 0;
        // int index = 0;

        for(int i=0;i<arr.length;i=(i+1)%arr.length){
             
            int n = ++dist;
            if(candies >= n){ 
            arr[i]=arr[i] + n ;
            candies = candies - n;
            }else{
                arr[i] += candies;
                break;
            }
        }

        return arr;
    }
}