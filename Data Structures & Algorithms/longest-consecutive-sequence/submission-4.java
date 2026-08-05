class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums); // sorting first will increase the time complexity
        // int count=0;
        // if (nums.length==0){
        //     return 0;
        // }
        // for(int i=0; i<nums.length-1; i++){
        //     if (nums[i+1]==nums[i]+1 || nums[i+1]==nums[i]){
        //         count++; // only counts the adjacent pairs which is a wrong approach
        //     }
        // }
        // return count;

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int seq_count =0;
        for(int num : nums){
            if (!set.contains(num-1)){
            int start = num;
            int count=1;
            while(set.contains(start+1)){
                start++;
                count++;
            }
            seq_count = Math.max(seq_count, count);
            }

        }
        return seq_count;
    }
}
