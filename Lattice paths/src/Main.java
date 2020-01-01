public class Main {
    public static void main(String[] args) {
        int N = 20;
        long R = 1L;
        for(int i = 1; i<= N; i++){
            R = R*(N+i)/i;
        }
        System.out.println(R);
    }
}
