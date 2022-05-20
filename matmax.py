def min(matrix,i):
    min = 0
    col = len(matrix[0])
    min = matrix[i][0]
    for j in range(col) :
        if (min > matrix[i][j]) :
            min = matrix[i][j]
    return min
def max(matrix,i):
    max = 0
    col = len(matrix[0])
    for j in range(col):
        if matrix[i][j] > max :
            max = matrix[i][j]                 
    return max
t=int(input())
while t>0:
    rows,columns=(input()).split()
    rows,columns=int(rows),int(columns)
    mat = []
    for i in range(rows):
        # a=[]
        # for j in range (columns):
        #     a.append(int(input()))
        a=input().split(' ')
        for i in range(0, len(a)):
             a[i] = int(a[i])
        mat.append(a)
    d=0  
    for i in range(rows):
        if (d<max(mat,i)-min(mat,i)):
            d= max(mat,i)-min(mat,i)
    print(d)    
    t-=1