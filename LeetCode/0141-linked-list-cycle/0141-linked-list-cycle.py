# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head == None:
            return False
        dic = {}
        while head:
            if head in dic:
                return True
            dic[head] = head.val
            head = head.next
        
        return False
    