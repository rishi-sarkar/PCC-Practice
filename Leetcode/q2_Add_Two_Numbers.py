from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        ans = ListNode()
        prev = ans
        carry = 0
        total = 0
        
        while (l1 != None or l2 != None):
            total = 0
            if l1 != None:
                total += l1.val
                l1 = l1.next
            if l2 != None:
                total += l2. val
                l2 = l2.next
            
            total += carry
            carry = total//10
            total = total%10

            prev.next = ListNode(total, None)
            prev = prev.next
        if carry == 1:
            prev.next = ListNode(1, None)
        return ans.next