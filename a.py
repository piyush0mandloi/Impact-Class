s = "abcdeffedcba"
i,j = 0, len(s)-1
while i<j:
    if s[i]!=s[j]:
        break
    i += 1
    j-=1

if i>=j:
    print("YES")