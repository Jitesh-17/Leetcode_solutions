class Solution {
    class Pair{
        int frequency;
        String word;
        Pair(int frequency,String word){
            this.frequency = frequency;
            this.word = word;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        Map <String,Integer> map = new HashMap<>();

        for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue <Pair> pq = new PriorityQueue<>
            ((a,b)-> {
                if(a.frequency!=b.frequency){
                    return a.frequency - b.frequency;
                }

                return b.word.compareTo(a.word);
            });

        int freq = -1;
        String word = " ";

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            freq = entry.getValue();
             word = entry.getKey();

            Pair p = new Pair(freq,word);

            if(pq.size()<k){
                pq.add(p);
            }else{
                Pair worst = pq.peek();
                if(p.frequency>worst.frequency||
                    (p.frequency==worst.frequency&&p.word.compareTo(worst.word)<0)){
                    pq.remove();
                    pq.add(p);
                }else{
                    continue;
                }
            }

        }      
       
        List<String> ans = new ArrayList<>();

        while(!pq.isEmpty()){
            String s = pq.peek().word;
           
            ans.add(s);
            pq.remove();
        }
        Collections.reverse(ans);
        return ans;
    }
}