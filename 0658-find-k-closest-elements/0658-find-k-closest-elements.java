class Solution {
    // class Pair{
    //     int ele;
    //     int dist;

    //     Pair(int ele,int dist){
    //         this.ele=ele;
    //         this.dist=dist;
    //     }
    // }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // input array is sorted so the correct and effcient approach is by binary search
        // and maintaining a window of size k
        // if the same question input would not hv been sorted heap approach would hv been 
        // most efficient

        //heap
    //     PriorityQueue<Pair> pq = new PriorityQueue<>(
    //         (a,b)->{
    //              if(a.dist!=b.dist){
    //             return b.dist - a.dist;
    //              }
    //             return a.ele - b.ele;
    //         }
    //     );

    //     for(int i=0;i<arr.length;i++){
    //         int dist = Math.abs(arr[i]-x);
    //         Pair p = new Pair(arr[i],dist);

    //         if(pq.size()<k){
    //             pq.offer(p);
    //         }else{
    //             if(dist<pq.peek().dist){
    //                 pq.remove();
    //                 pq.offer(p);
    //             }
    //         }
    //     }

    //     List<Integer> res = new ArrayList<>();

    //     while(!pq.isEmpty()){
    //         res.add(pq.poll().ele);
    //     }

    //     Collections.sort(res);
    //     return res;
    // }

    // Binary search / window 
    int left = 0;
    int right = arr.length-1;

    while(right-left>=k){
        if(Math.abs(arr[left]-x)<=Math.abs(arr[right]-x)){
            right--;
        }else{
            left++;
        }
    }

    List<Integer> res = new ArrayList<>();
    for(int i=left;i<=right;i++){
        res.add(arr[i]);
    }

    return res;
    }
}