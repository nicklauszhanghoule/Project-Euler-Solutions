public class Main {
    public static void main(String[] args) {
        int N = 0;
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            N+=i;
            if(fC(N)>500){
                System.out.println(N);
                break;
            }
        }
    }
    static int fC(int N){
        int C = 0;
        for(int i = 1; i<= Math.sqrt(N); i++){
            if(N%i==0){
                C+=2;
            }
        }
        if(Math.sqrt(N)*Math.sqrt(N)==N){
            C--;
        }
        return C;
    }
}