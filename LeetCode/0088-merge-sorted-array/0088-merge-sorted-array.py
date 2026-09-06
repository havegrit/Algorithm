class Solution(object):
    def merge(self, nums1, m, nums2, n):
        i = 0
        for num in nums2:
            nums1[m+i] = num
            i = i + 1
        nums1.sort()