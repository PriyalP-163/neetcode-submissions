class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int num : nums){
            h.put(num, h.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : h.entrySet()){
            if (e.getValue()>1){
                return true;
            }
        }
        return false;
    }
}