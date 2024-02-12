def isMatrixSymmetric(matrix):
    n = len(matrix)
    
    for row in matrix:
        if len(row) != n:
            return "No"

    for i in range(n):
        for j in range(i):
            if matrix[i][j] != matrix[j][i]:
                return "No"

    return "Yes"

res = isMatrixSymmetric([[1,2,3],[4,5,6], [7,8,9]])
print(res)