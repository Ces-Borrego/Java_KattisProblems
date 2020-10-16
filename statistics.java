import java.util.Scanner;
public class statistics {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cases = 0;
        while (keyboard.hasNextInt())
        {
            cases++;
            int nums = keyboard.nextInt();
            int min =  10000000;
            int max = -10000000;
            for (int i = 0; i < nums; i++)
            {
                int s = keyboard.nextInt();
                min = Math.min(min, s);
                max = Math.max(max, s);
            }
            System.out.println("Case " + cases + ": " + min + " " + max + " " + (max - min));
        }
    }
}