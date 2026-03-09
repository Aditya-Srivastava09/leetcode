class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        PriorityQueue<ListNode> pq =new PriorityQueue<>((l1, l2) -> l1.val - l2.val);

        for(ListNode h : lists){
            if(h != null){
                pq.add(h);
            }
        }
        while(!pq.isEmpty()){
            ListNode h = pq.poll();
            tail.next = h;
            tail = h;
            if(h.next != null){
                pq.add(h.next);
            }
        }
        return dummy.next;
    }
}