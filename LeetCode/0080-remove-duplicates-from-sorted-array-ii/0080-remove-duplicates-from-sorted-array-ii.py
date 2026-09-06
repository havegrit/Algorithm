class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for num in nums:
            while nums.count(num) > 2:
                nums.remove(num)
        return len(nums)