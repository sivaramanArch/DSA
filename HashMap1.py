class Solution:
    def nearest_repeated_entries(self, sentence) -> int:
        mapp = dict() 
        
        res = len(sentence)

        flag = False
        for i, ch in enumerate(sentence):
            prevIndex = mapp.get(ch, None)
            if(prevIndex):
                flag = True
                currentInterval = i - prevIndex 
                res = min(res, currentInterval)
                mapp[ch] = i
            else:
                mapp[ch] = i

        if(not flag):
            return -1

        return res
                
                
                
s = Solution() 

val = s.nearest_repeated_entries(["This", "is", "a"])

print(val)
