class Solution:
    def checkPalindrome(self, s: str) -> bool:
        loop = int(len(s)/2)
        length = len(s) - 1
        for i in range(loop):
            if (s[i] == s[length - i]):
                continue
            return False
        return True

    def longestPalindrome(self, s: str) -> str:
        l = 0
        r = len(s)
        for i in range(len(s)+1):
            while r != (len(s)+1):
                new_s = s[l:r]
                if self.checkPalindrome(new_s):
                    return new_s
                r += 1
                l += 1
            r -= (1 + i)
            l = 0
        return ""

# TODO: Time: O(N^2), Optimize
