// tiling problem using recursion

class Main {
    static int ways(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
       
        return ways(n-1)+ ways(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(ways(n));
    }
}