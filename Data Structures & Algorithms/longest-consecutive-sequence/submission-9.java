class Solution {
    public int longestConsecutive(int[] nums) {
        // 1st approach TC increase
        Arrays.sort(nums); // sorting first will increase the time complexity
        
        if (nums.length==0){
            return 0;
        }
        int seq_count=1;
        int count=1;
        for(int i=1; i<nums.length; i++){
            if (nums[i]==nums[i-1]){
                continue; 
            }
            else if (nums[i]==nums[i-1]+1){
                count++;
            }
            else{
                seq_count =Math.max(seq_count, count);
                count=1;
            }
        }
        return Math.max(seq_count, count);

         // 2nd approch TC:o(n) as expected
        // Set<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        // int seq_count =0;
        // for(int num : nums){
        //     if (!set.contains(num-1)){
        //     int start = num;
        //     int count=1;
        //     while(set.contains(start+1)){
        //         start++;
        //         count++;
        //     }
        //     seq_count = Math.max(seq_count, count);
        //     }

        // }
        // return seq_count;
    }
}
