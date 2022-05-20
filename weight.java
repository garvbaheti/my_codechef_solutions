import java.util.*;
public class weight {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T>0) { 
            int n=scan.nextInt();
            int k=scan.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                 a[i]=scan.nextInt();
            }
            Arrays.sort(a);
            int weightchild=0;
            int weightparent=0;
            if(k<=n-k){
                for(int i=0;i<k;i++){
                    weightchild+=a[i];
                }
                for(int i=k;i<n;i++){
                    weightparent+=a[i];
                }
            }
            else{
                for(int i=0;i<n-k;i++){
                    weightchild+=a[i];
                }
                for(int i=n-k;i<n;i++){
                    weightparent+=a[i];
                }
            }
            System.out.println(weightparent-weightchild);
            T--;
        }
        scan.close();
    }
}