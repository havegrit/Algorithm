class Solution(object):
    def removeElement(self, nums, val):
        numberOfValInList = nums.count(val)
        while numberOfValInList:
            nums.remove(val)
            numberOfValInList = numberOfValInList - 1