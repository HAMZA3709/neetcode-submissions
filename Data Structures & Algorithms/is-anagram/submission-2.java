class Solution {
    public boolean isAnagram(String s, String t) { 
     if(s.length()==t.length()){
    List<Character> seen = new ArrayList<>();
    for (char c : t.toCharArray()) {
    seen.add(c);
}
  List<Character> teen = new ArrayList<>();
    for (char sou : s.toCharArray()) {
    
    if(seen.contains(sou)){
        seen.remove(Character.valueOf(sou));
    }
}
 
if(seen.isEmpty()){
    return true;
}

return false;
     }
     else
     return false;
 }  
}
