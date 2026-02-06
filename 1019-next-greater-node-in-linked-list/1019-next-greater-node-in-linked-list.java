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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        //int idx=0;
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        int[] ans=new int[a.size()];

        for(int i=0;i<a.size();i++){
           while(!st.isEmpty() && a.get(st.peek())<a.get(i)){
                    ans[st.pop()]=a.get(i);
              }
            st.push(i);
        }

     return ans;
    
    }
}