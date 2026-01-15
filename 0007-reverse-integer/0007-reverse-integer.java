class Solution {
    public int reverse(int x) {
        String b = String.valueOf(x);
        List<Character> a = new ArrayList<>();

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (Character.isDigit(c)) {
                a.add(c);
            }
        }
        StringBuilder k = new StringBuilder();
        for (int i = a.size() - 1; i >= 0; i--) {
            k.append(a.get(i));
        }
        while (k.length() > 1 && k.charAt(0) == '0') {
            k.deleteCharAt(0);
        }
        if (x < 0) {
            k.insert(0, '-');
        }
        String z=k.toString();
        long val=Long.parseLong(z);
        if(val>Integer.MAX_VALUE || val<Integer.MIN_VALUE){
            return 0;
        }
        return (int)val;
    }
}
