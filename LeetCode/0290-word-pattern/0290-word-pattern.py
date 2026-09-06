class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(' ')
        dic = {}
        newPattern = ''
        
        if len(pattern) != len(words):
            return False
        
        for i in range(len(words)):
            if dic.get(pattern[i]) == None:
                if words[i] in dic.values():
                    return False
            dic[pattern[i]] = words[i]  
        
        for j in range(len(pattern)):
            if dic.get(pattern[j]) == None:
                return False
            newPattern += dic.get(pattern[j])
        
        s = s.replace(' ', '')
            
        return True if newPattern == s else False