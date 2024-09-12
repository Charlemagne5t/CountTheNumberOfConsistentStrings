class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] a = new boolean[26];
        for(int i = 0; i < allowed.length(); i++) {
            a[allowed.charAt(i) - 'a'] = true;
        }

        int res = 0;
        for(String w : words) {
            boolean count = true;
            for(int i = 0; i < w.length(); i++) {
                if(!a[w.charAt(i) - 'a']){
                    count = false;
                    break;
                }
            }
            if(count) {
                res++;
            }
        }

        return res;

        
    }
}