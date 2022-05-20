import java.util.*;
class sticks{
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int T = scan.nextInt();
        while(T-->0){
            int n =scan.nextInt();
            int []frequency=new int[1001];
            int [] a= new int[n];
            int area=1;
            boolean flag = false;
            boolean complete = false;
            for(int i=0;i<n;i++){
                a[i]=scan.nextInt();
                frequency[a[i]]+=1;
            }
            for(int i=(frequency.length-1);i>=0;i--){
                if(flag==false){
                    if(frequency[i]>=2){
                        area *= i;
                        flag=true;
                        frequency[i]-=2;
                    }
                }
                else if(flag==true){
                    if(frequency[i]>=2){
                        area*=i;
                        complete=true;
                        break;
                    }
                }
            }
            if(complete==true){
                System.out.println(area);
            }
            if(complete==false){
                System.out.println(-1);
            }
        }
        scan.close();
    }
}
