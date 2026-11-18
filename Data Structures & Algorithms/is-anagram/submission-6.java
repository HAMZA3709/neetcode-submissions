class Solution {
    public boolean isAnagram(String s, String t) { 
        char[] se = s.toCharArray();
        char[] te =t.toCharArray();
        Arrays.sort(se);
        Arrays.sort(te);
        s = new String(se);
        t = new String(te);
        if(s.equals(t))
        return true ;
        else 
        return false ;


    }
}
