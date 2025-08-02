class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] copy2 = new int[nums.length*2];//just create the size mulltiplying bu 2 so if the length is 3 the resultant array's length is 6
        for(int i=0;i<nums.length;i++){
            copy2[i] = nums[i];//for first half elements of resultant array
        }
        for(int i=0;i<nums.length;i++){
            copy2[i+nums.length] = nums[i]; //for remaining half elements of resultant array;
        }
        return copy2;
    }
}
