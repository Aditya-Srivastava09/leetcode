class pair{
    String s;
    int freq;
    pair(String s,int freq){
        this.s=s;
        this.freq=freq;
    }
}




class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
    HashMap<String,Integer> map=new HashMap<>();
     for(String ele:words){
       map.put(ele,map.getOrDefault(ele,0)+1);
     }
     PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.freq==b.freq?b.s.compareTo(a.s):a.freq-b.freq);
     for(Map.Entry<String,Integer> entry:map.entrySet()){
          String s=entry.getKey();
          int e=entry.getValue();
          pq.add(new pair(s,e));
          if(pq.size()>k){
            pq.poll();
          }
     }

        ArrayList<String> a=new ArrayList<>();
        while(!pq.isEmpty()){
            a.add(pq.poll().s);
        }
        Collections.reverse(a);
        return a;
       















    }
}