import java.util.*;
public class thef {
    //function for reversing the string 
    public static String reverse(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            ans=str.charAt(i)+ans;
        }
        return ans;
    }
    //function to check if string is equal or not
    public static boolean check(String a,String b){
        String subStra=a.substring(1);
        String subStrb=b.substring(1);
        return subStra.equals(subStrb);
    }
    
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String a =sc.next();
            String b =sc.next();
            if(a.equals(b)){
                System.out.println("Yes");
                continue;
            }
            if(check(a,b)){
                System.out.println("Yes");
                continue;
            }
            String reva=reverse(a);
            String revb=reverse(b);
            if(check(reva,b)){
                System.out.println("Yes");
                continue;
            }
            if(check(revb,a)){
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
        sc.close();
    }    
}
