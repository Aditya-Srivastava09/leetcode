class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        Set<Long> s = new HashSet<>();
        heap.add(1L);
        int c=0;
        while(!heap.isEmpty()){
            long ele = heap.poll();
            if(!s.contains(ele)){
                heap.add(ele*2);
                heap.add(ele*3);
                heap.add(ele*5);
                s.add(ele);
                c++;

            }
            if(c==n){
                c=(int)ele;
                break;
            }
        }
        return c;
    }
}