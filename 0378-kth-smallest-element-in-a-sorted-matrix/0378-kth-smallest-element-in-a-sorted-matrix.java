class Solution {
    // sorted so can be solved using binary search also 
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int ele = matrix[i][j];

                if(pq.size()<k){
                    pq.offer(ele); 
                }else{
                   if(ele<pq.peek()){
                    pq.remove();
                    pq.offer(ele);
                   }
                }
            }
        }
        return pq.peek();
    }
}