import java.util.*;
public class chopsticks {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        int d=scan.nextInt();
        int sticks=0;
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        int i=0;
        while(i<n-1){
            if((a[i+1]-a[i])<=d){
                sticks+=1;
                i+=2;
            }
            else{
                i++;
            }
        }
        System.out.println(sticks);
        scan.close();
    }
}
