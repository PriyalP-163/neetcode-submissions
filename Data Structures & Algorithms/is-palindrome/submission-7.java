class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        // for(int i=0; i<n/2; i++){
        //     int left = s.charAt(i);
        //     int right = s.charAt(n-1-i);
        //     if (!Character.isLetterOrDigit(left)||!Character.isLetterOrDigit(right)) {
        //         continue;
        //     }
        //     if (Character.toLowerCase(left)!=Character.toLowerCase(right)){
        //          return false;
        //     }
            
        // }
        // return true;
        int left =0;
        int right = s.length()-1;
        while (left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))) left++;
            else if (!Character.isLetterOrDigit(s.charAt(right))) right--;
            else{
                if (Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) return false;
            
            left++;
            right--;
            }
        }
        return true;

    }
}
