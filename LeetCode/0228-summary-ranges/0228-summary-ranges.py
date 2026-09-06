class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        result = []
        
        if len(nums) == 0:
            return result
        
        a = nums[0]
        b = nums[0]
        i = 0
        
        while True:
            if i == len(nums)-1:
                if a == b:
                    result.append(str(a))
                else:
                    result.append("%d->%d" %(a, b))
                break
            if b + 1 == nums[i+1]:
                b = nums[i+1]
            else:
                b = nums[i]
                if a == b:
                    result.append(str(a))
                else:
                    result.append("%d->%d" %(a, b))
                a = nums[i+1]
                b = nums[i+1]
            i += 1
                
        return result