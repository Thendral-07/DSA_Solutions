class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums.sort()
        n = len(nums)
        kth = n - k
        maxi = nums[0]
        for i in range(kth + 1) #i added this because while im calculating k it gives but in loop while giving the range() function it ignores the last one when i add 1 it also include the Kth last
            if nums[i] > maxi:
                maxi = nums[i]
        return maxi
# That's all
