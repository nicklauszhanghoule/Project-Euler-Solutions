public class Main {
    public static void main(String[] args) {
        int N = 2000000;
        long sum = 0;
        for(int i = 2; i <= N; i++){
            if(iP(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    static boolean iP(long N) {
        if (N < 2) {
            return false;
        }
        if (N == 2) {
            return true;
        }
        if (N % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}