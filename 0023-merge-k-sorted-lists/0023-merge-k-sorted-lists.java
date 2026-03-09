/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> aa=new ArrayList<>();
        for(ListNode a:lists){
            while(a!=null){
                aa.add(a.val);
                a=a.next;
            }
        }
        if(aa.size() == 0) return null;

        Collections.sort(aa);
        ListNode l=new ListNode(aa.get(0));
        ListNode k=l;
        for(int i=1;i<aa.size();i++){
            ListNode g=new ListNode(aa.get(i));
            l.next=g;
            l=l.next;
        }

        return k;
    }
}