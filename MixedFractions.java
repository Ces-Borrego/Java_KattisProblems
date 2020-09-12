import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int numerator = in.nextInt(), denominator = in.nextInt();
            if(numerator == 0 && denominator == 0){ break; }
            System.out.println((numerator/denominator) + " " + (numerator%denominator) + " / " + denominator);
        }
    }
}

