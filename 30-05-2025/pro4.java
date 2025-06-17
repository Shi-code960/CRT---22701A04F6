//sum of digits in a single number
class Main {
    public static void main(String[] args) {
        int num=4521;
        int sum=0;
        int temp=num;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
}