import java.util.*;
public class mex {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int []a=new int[200001];
            int []freq=new int[100001];
            int i=0;
            int mex=0;
            while(i<n){
                a[i]=scan.nextInt();
                freq[a[i]]+=1;
                i++;
            }
            while(k>0){
                for(int l=0;l<freq.length-1;l++){
                    if(freq[l]==0){
                        a[i]=l;
                        freq[l]+=1;
                        k--;
                    }
                }
            }
            Arrays.sort(a);
            for(int p=freq.length-1;p>=0;p--){
                if(freq[p]==0){
                    mex=p;
                }
            }
            System.out.println(mex);
        }
        scan.close();
    }
}
