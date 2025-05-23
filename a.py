# arr = ["tax", "xeron", "neo", "orbit", "titan", "ask"]
# res = []
# i=0
# while i < len(arr)-1:
#     # if arr[i][-1] ==arr[i+1][0]:
#     #     if arr[i] not in res:
#     #         res.append(arr[i])
#     #     if arr[i+1] not in res:
#     #         res.append(arr[i+1])
#     # else:
#     #     if arr[i] not in res:
#     #         res.append(arr[i])
#     #     break

#     res.append(arr[i])
#     if arr[i][-1] != arr[i+1][0]:
#         break

#     i += 1    
# print(res)


# # arr  = ["hello", "world", "python", "java", "javascript"]
# # res = []
# # for i in arr:
# #     res.append(i[::-1])
# # print(res)



# def incremovable(arr):
#     check=True
#     for i in range(len(arr)-1):
#         if arr[i]>arr[i+1]:
#             check = False
#     return check==True

# print(incremovable([1,2,13,4,5]))


# s = "abe"
# s = "aed"
# t = "abcde"
# i,j = 0, 0
# while i<len(s) and j<len(t):
#     if s[i] == s[j]:
#         i+=1
    

# from itertools import combinations

# s = "one"
# res = []

# for r in range(1, len(s)+1):
#     for combo in combinations(s, r):
#         res.append(''.join(combo))

# print(res)


# s = "eat"
# # t = "tea"
# t = "ett"
# hashmap = {}
# check = True
# for i in s:
#     if i in hashmap:
#         hashmap[i] += 1
#     else:
#         hashmap[i] = 1

# for i in t:
#     if i in hashmap and hashmap[i] > 0:
#         hashmap[i] -= 1
#     else:
#         check = False
#         break

# if check:
#     print("YES")
# else:
#     print("NO")


# x = 39631
# arr = list(str(x))
# res=""
# for i in range(0,len(str(x))-1,2):
#     res+=arr[i+1]
#     res+=arr[i]

# if len(arr)%2!=0:
#     res+=arr[-1]

# print(''.join(res))



# s = "BikeWay"
# t = "Bike"
# for i in t:
#     if i in s:
#         s = s.replace(i, "")

# print(s)

# s = "15abc1"
# arr = ["0","1","2","3","4","5","6","7","8","9"]
# ans = 0
# for i in s:
#     if i in arr: 
#         ans += int(i)
# print(ans)

# matrix = [
#     [1, 2, 3],
#     [4, 5, 6],
#     [7, 8, 9]
# ]

# print("Enter the size of the matrix:")
# n = int(input())
# print("Enter the elements of the matrix:")
# matrix = [[0 for j in range(n)] for i in range(n)]
# for i in range(n):
#     for j in range(n):
#         matrix[i][j] = int(input())

# print("The original matrix is:")
# for row in matrix:
#     print(row)

# for i in range(len(matrix)):
#     for j in range(len(matrix[0])):
#         if i < j:
#             matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

# print("The transposed matrix is:")
# for row in matrix:
#     print(row)


matrix = [
    [0,0,0],
    [6,0,0],
    [1,2,0]
]
check = True
for i in range(len(matrix)):
    for j in range(len(matrix[0])):
        if i==j or i<j:
            if matrix[i][j] == 0:
                check = True
            else:
                check = False
                break
if check:
    print("Upper Triangular Matrix")
else:   
    print("Not Upper Triangular Matrix")