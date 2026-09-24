class Solution {
    class Pair{
        int[] ele ;
        long dist;

        Pair(int[] ele,long dist){
            this.ele = ele;
            this.dist = dist;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> Long.compare(b.dist,a.dist)
        );

        for(int i=0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];

            long dist =(long)x*x+(long)y*y;
            Pair p = new Pair(points[i],dist);
            if(pq.size()<k){
                pq.add(p);
            }else{
                if(dist<pq.peek().dist){
                    pq.remove();
                    pq.add(p);
                }
            }
        }
        int [][] res = new int[k][2];
        int index = 0;
        while(!pq.isEmpty()){
             res[index]= pq.peek().ele;
             index++;
            pq.remove();

        }
        return res;
    }
}