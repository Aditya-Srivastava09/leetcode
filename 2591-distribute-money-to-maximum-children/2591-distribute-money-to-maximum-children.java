class Solution {
    public int distMoney(int money, int children) {
        if(money<children){
            return-1;
        }
        money=money-children;
        int c=Math.min(money/7,children);
        money=money-c*7;
        children=children-c;
        if(children==0 && money>0){
            return c-1;
        }
        if(children==1 && money==3){
            return c-1;
        }
        return c;
    }
}
