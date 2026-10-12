class Solution {
    public int maxProduct(int n) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while(n > 0){
            int digit = n%10;

            if(pq.size()<2){
                pq.add(digit);
            }else {
                if(pq.peek()<digit){
                    pq.remove();
                    pq.add(digit);
                }
            }

            n = n/10;
        }   

        int n1 = pq.poll();
        int n2 = pq.poll();

        return n1*n2;    
    }
}