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
    public ListNode doubleIt(ListNode head) {
       StringBuilder sb=new StringBuilder();
       ListNode n=head;
       while(n!=null){
        sb.append(n.val);
        n=n.next;
       }
       String s=sb.toString();
       int a=Integer.parseInt(s);
     a=a*2;
       String sg=""+a;
       ListNode node=new ListNode(sg.charAt(0)-'0');
       ListNode x=node;
       for(int i=1;i<sg.length();i++){
        ListNode dd=new ListNode(sg.charAt(i)-'0');
        node.next=dd;
        node=node.next;
       }
       return x;

    }
}