import java.util.Scanner;

public class mex2 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int T = scan.nextInt();
        while(T-->0){
            int n = scan.nextInt();
		    int k = scan.nextInt();
            int mex = 0;
            int x=n+k;
		    int arr[] = new int[x+1];
		    for(int i = 0 ; i < n ; i++){
		        int num = scan.nextInt();
		        if(num <= x){
		            arr[num] = 1;
                }
		    }
		    for(int i = 0 ; i <= x ; i++){
                if(arr[i] == 0){
                    mex = i;
                    if(k == 0){
                       break;
                    }
                    else{
		                k--;
                    }
                }
		    }
		    System.out.println(mex);
        }
        scan.close();
    }
}
