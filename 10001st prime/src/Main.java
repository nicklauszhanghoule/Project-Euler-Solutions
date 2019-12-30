public class Main {
    public static void main(String[] args) {
        int c = 0;
        for(int i = 2; c<Integer.MAX_VALUE; i++){
            boolean isPrime = true;
            for(int j = 2; j<i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                c++;
                if(c==10001){
                    System.out.println(i);
                }
            }
        }
    }
}