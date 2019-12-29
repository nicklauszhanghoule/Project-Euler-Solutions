import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long N = 600851475143L;
        System.out.println(GPF(N));
    }
    static long GPF(long N){
        long GPF = 0;
        for(long i = 2; i <= N; i++){
            if(N%i==0){
                if(i>GPF){
                    GPF = i;
                }
                N/=i;
                i--;
            }
        }
        return GPF;
    }
}
