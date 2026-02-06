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
    public int getDecimalValue(ListNode head) {
        ListNode n=head;
        if(n.val==0){
            return 0;
        }
        StringBuilder sb=new StringBuilder();
        while(n!=null){
            sb.append(n.val);
            n=n.next;
        }
        int x=sb.length()-1;
        int ans=0;

        for(int i=0;i<sb.length();i++){
            ans+=(int)Math.pow(2,x)*(sb.charAt(i)-'0');
            x--;
        }
        return ans;
    }
}