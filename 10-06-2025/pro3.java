import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a=10,b=2,x=15,y=5;
       int val1=n%a==0?n/a:n/a+1;
       int res=Integer.MAX_VALUE;
       for(int i=0;i<=val1;i++){
           int rem=n-10*i;
           int val2=0;
           if(rem>0){
               val2=rem%b==0?rem/b:rem/b+1;
           }
           res=Math.min(res,x*i+y*val2);
       }
       System.out.println(res);
    }
}