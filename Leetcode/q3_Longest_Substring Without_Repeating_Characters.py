class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        repeat = {}
        l = -1
        best_r = 0
        best_l = 0

        for r, char in enumerate(s):
            if char in repeat and l < repeat[char]:
                l = repeat[char]
            repeat[char] = r

            if (best_r - best_l < (r - l)):
                best_l = l
                best_r = r
        return best_r-best_l
