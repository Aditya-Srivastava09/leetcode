class Solution{
    public boolean isPalindrome(ListNode head){
        if(head==null||head.next==null)return true;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null,cur=slow,next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        ListNode left=head,right=prev;
        while(right!=null){
            if(left.val!=right.val)return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }
}
