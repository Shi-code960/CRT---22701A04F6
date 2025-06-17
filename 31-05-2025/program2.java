class Main {
    public static void main(String[] args) {
        int n=8;
        int count=0;
        for(int i=1;i<8;i++){
            if(n%i==0){
                count=count+1;
            }
        }
      if(count==3){
          System.out.println("good number");
      }
      else{
          System.out.println("bad number");
      }
    }
}