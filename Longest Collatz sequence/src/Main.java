import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Long> s = new ArrayList<>();
        int N = 0;
        int LC = 0;
        for(int i = 2; i< 1000000; i++){
            long j = i;
            while(j!=1){
                if(j%2==0){
                    j/=2;
                } else {
                    j = (3*j) + 1;
                }
                s.add(j);
            }
            if(s.size()>LC){
                LC = s.size();
                N = i;
            }
            s.clear();
        }
        System.out.println(N);
    }
}
