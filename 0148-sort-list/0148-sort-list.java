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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return  null;
        }
        ArrayList<Integer> l=new ArrayList<>();
        ListNode dum=head;
        while(dum!=null){
            l.add(dum.val);
            dum=dum.next;
        }
        Collections.sort(l);
        ListNode l1=new ListNode(l.get(0));
        ListNode l2=l1;
        for(int i=1;i<l.size();i++){
            l1.next=new ListNode(l.get(i));
            l1=l1.next;
        }

   
      return l2;
    }
}