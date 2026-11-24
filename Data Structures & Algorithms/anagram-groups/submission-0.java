class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
         Arrays.toString(strs);
         HashMap<String, List<String>> list = new HashMap<>();
        for(String st : strs){
        char[] chars = st.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);   
        list.computeIfAbsent(sorted,k -> new ArrayList<>()).add(st);
        }
       return new ArrayList<>(list.values());
        
    }
}
