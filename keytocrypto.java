import java.util.Scanner;
import java.util.*;


public class keytocrypto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cypher = scan.next();
        String key = scan.next();
        StringBuilder answer = new StringBuilder(cypher);
        StringBuilder mKey = new StringBuilder(key);

        for (int x = 0; x < cypher.length(); x++) {
            int index = x % mKey.length();

            int value = (cypher.charAt(x) - 'A') - (mKey.charAt(index) - 'A');

            if(value >= 26) value -= 26;
            if(value < 0) value += 26;

            answer.setCharAt(x, (char)(value + (int)('A')));
            mKey.setCharAt(index, answer.charAt(x));
        }
        System.out.print(answer);
    }
}
