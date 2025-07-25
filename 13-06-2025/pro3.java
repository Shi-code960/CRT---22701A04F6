import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        System.out.println("maximum profit ="+napSack(8,0,new int[]{1,3,5,7},new int[]{2,4,7,10}));
    }
    public static long fibTabulation(int n,long[]memo){
        if(memo.length>=n){
            for(int i=2;i<=n;i++){
                long val = memo[i-1]+memo[i-2];
                memo[i] = val;
            }
            return memo[n];
        }
        System.out.println("Insufficient memory..! in memo"+memo.length);
        return -1;
    }
    public static int napSack(int bagWeight,int selectedElement,int[]weights,int[]profits){
        if(selectedElement>=weights.length||bagWeight==0){
            return 0;
        }
        int pick=0;
        if(bagWeight>=weights[selectedElement]){
            pick=profits[selectedElement]+napSack(bagWeight-weights[selectedElement],selectedElement+1,weights,profits);
        }
        int notPick = napSack(bagWeight,selectedElement+1,weights,profits);
        return Math.max(pick,notPick);
    }
}