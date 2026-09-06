class Solution:
    def isPalindrome(self, s: str) -> bool:
        s2 = ''
        for char in s:
            if char.isalnum():
                s2 += char.lower()
            
        reversedString = s2[::-1]
        
        return True if reversedString == s2 else False