// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         HashSet<Integer> seen = new HashSet<>();
//         for(int num : nums){
//             if(seen.contains(num)) return true;  // seen before = duplicate
//             seen.add(num);
//         }                        // not seen = add and continue
//         return false;
//     }
// }

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