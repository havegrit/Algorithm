class Solution(object):
    def majorityElement(self, nums):
        for num in nums:
            cnt = nums.count(num)
            if cnt >= len(nums) / 2.0:
                return num