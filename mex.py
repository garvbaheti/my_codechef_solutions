t=int(input())
for _ in range (t):
    n,k=map(int,input().split)
    st = set(list(map(int,input.split())))
    mex =0
    while True:
        if mex in str:
            mex+=1
        else:
            if k>0:
                k-=1
                mex+=1
            else:
                break
    print(mex)