class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)) return true;  // seen before = duplicate
            seen.add(num);
        }                        // not seen = add and continue
        return false;
    }
}