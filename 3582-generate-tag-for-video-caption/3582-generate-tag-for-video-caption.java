class Solution {
    public String generateTag(String caption) {
        String[] a=caption.trim().split("\\s+");
        StringBuilder sb=new StringBuilder("#");
        if(a.length==0)return "#";
        sb.append(a[0].toLowerCase());
        for(int i=1;i<a.length;i++){
            sb.append(Character.toUpperCase(a[i].charAt(0)));
            sb.append(a[i].substring(1).toLowerCase());
        }
        if(sb.length()>100)return sb.substring(0,100);
        return sb.toString();
    }
}
