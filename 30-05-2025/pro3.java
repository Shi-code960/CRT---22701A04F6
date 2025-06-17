class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int num=111;
        int evencount=0;
        int count=0;
        while(num>0){
         if((num%10)%2==0)
                evencount=evencount+1;
         
            count=count+1;
            num=num/10;
         
        }
            System.out.println((evencount==0) ||evencount==count?"good number":"bad number");
        
       
    }