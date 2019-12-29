public class Main {
    public static void main(String[] args) {
        long p;
        long c = 3;
        long n = 5;
        long s = 2;
        do{
            p = c;
            c = n;
            n = c + p;
            if(n%2==0){
                s+=n;
            }
        } while(n<4000000);
        System.out.println(s);
    }
}
