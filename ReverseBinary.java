import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class ReverseBinary {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int startNum = Integer.parseInt(keyboard.nextLine());
        String binary = Integer.toBinaryString(startNum);
        String reverse = "";

        int l = binary.length();

        for (int i = 0; i < l; i++) {
            reverse += binary.charAt(l - i - 1);
        }

        int endNum = Integer.parseInt(reverse, 2);

        System.out.println(Integer.toString(endNum));
    }
}
