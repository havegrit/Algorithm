class Solution(object):
    def rotate(self, nums, k):
        copyOfNums = nums[:]
        index = 0
        for num in copyOfNums:
            while (index + k) >= len(nums):
                index -= len(nums)
            nums[index + k] = num
            index += 1   