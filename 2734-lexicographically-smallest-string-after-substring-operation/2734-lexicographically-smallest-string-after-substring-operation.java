class Solution{
    public String smallestString(String s){
        char[] a=s.toCharArray();
        int n=a.length;
        int i=0;
        while(i<n&&a[i]=='a'){
            i++;
        }
         if(i==n){
            a[n-1]='z';
            return new String(a);
        }
       while(i<n&&a[i]!='a'){
            a[i]=(char)(a[i]-1);
            i++;
        }
        return new String(a);
    }
}
