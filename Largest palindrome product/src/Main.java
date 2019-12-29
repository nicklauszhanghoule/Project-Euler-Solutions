public class Main {
    public static void main(String[] args) {
        int gP = 0;
        for(int i = 100; i< 999; i++){
            for(int j = 100; j < 999; j++){
                int g = i*j;
                if(isP(g)){
                    if(g>gP){
                        gP = g;
                    }
                }
            }
        }
        System.out.println(gP);
    }
    public static boolean isP(int N){
        StringBuffer sb = new StringBuffer(Integer.toString(N));
        return Integer.toString(N).equals(sb.reverse().toString());
    }
}
