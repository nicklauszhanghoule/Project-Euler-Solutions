import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner fileReader = new Scanner(new File("FILE LOCATION OF LargeSumNumber.txt"));
            BigInteger sum = BigInteger.ZERO;
            while(fileReader.hasNextLine()){
                sum = sum.add(new BigInteger(fileReader.nextLine()));
            }
            System.out.println(sum.toString().substring(0,10));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
