//sum of elements in a array
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] nums={25,75,100,125};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int value=nums[i];
            sum=sum+value;
        }
        System.out.print(sum);
    }
}