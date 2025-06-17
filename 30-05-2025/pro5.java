//reverse of number
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int num=4521;
        int rev=0;
        int copy=num;
        while(copy>0){
            int rem=copy%10;
            rev=rev*10+rem;
            copy=copy/10;
        }
        System.out.println(rev);
    }
}