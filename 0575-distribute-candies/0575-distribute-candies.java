class Solution {
    public int distributeCandies(int[] candyType) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : candyType){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int distinctCandy = map.size();

        // for(int i=1;i<candyType.length;i++){
        //     if(candyType[i]!=candyType[i-1]){
        //         distinctCandy++;
        //     }
        // }


        int res = Math.min(distinctCandy,(candyType.length/2));

        return res;
    }
}