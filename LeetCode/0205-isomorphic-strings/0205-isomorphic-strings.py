class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        newString = ''
        dic = {}
        
        for i in range(len(s)):
            if dic.get(s[i]) == None and t[i] not in dic.values():
                dic[s[i]] = t[i]
        
        for char in s:
            if dic.get(char) == None:
                return False
            newString += dic.get(char)
        
        return True if newString == t else False