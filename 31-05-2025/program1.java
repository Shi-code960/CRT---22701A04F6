class Main {
    public static void main(String[] args) {
       int num=333;
       int rev=0;
       int copy=num;
       while(copy>0){
           int rem=copy%10;
           rev=rev*10+rem;
           copy=copy/10;
       }
       if(num==rev){
           System.out.println("polindrome");
       }
       else{
           System.out.println("not polindrome");
       }
    }
}