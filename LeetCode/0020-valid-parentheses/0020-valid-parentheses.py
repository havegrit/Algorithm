class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) % 2 != 0:
            return False
    
        openBrackets = ["(", "{", "["]
        closeBrackets = [")", "}", "]"]
        brackets = []
        
        for char in s:
            brackets.append(char)
        
        i = 0
        while len(brackets) != 0:
            i += 1
            if i == len(brackets):
                return False
            if not brackets[i] in openBrackets:
                if (not brackets[i-1] in openBrackets) or (not brackets[i] in closeBrackets):
                    return False
                if openBrackets.index(brackets[i-1]) != closeBrackets.index(brackets[i]):
                    return False
                brackets.pop(i)
                brackets.pop(i-1)
                i = 0
        
        return True