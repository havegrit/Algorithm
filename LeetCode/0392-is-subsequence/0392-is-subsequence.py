class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        for char in t:
            if not s.count(char):
                t = t.replace(char, '')
        seq = 0
        for char in t:
            if char == s[seq]:
                seq += 1
                
        if seq != len(s):
            return False
            
        return True