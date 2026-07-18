class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for (String s : strs){
            int [] freq = new int[26]; //freq array for lower case alpha
            for (char c: s.toCharArray()){
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
