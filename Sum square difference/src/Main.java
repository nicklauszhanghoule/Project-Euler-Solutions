public class Main {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        for(int i = 1; i <= 100; i++){
            sumOfSquares += i*i;
        }
        int squareOfSums = (100*(100+1))/2;
        squareOfSums*=squareOfSums;
        System.out.println(squareOfSums-sumOfSquares);
    }
}