public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfM(10));
        System.out.println(sumOfM(1000));
    }
    static int sumOfM(int N){
        int sum = 0;
        for(int i = 0; i<N; i++){
            if(i%3 == 0 || i%5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
