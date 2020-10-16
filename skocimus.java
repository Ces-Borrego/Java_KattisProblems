import java.util.Scanner;
public class skocimus {
    public static void main(String[] args) {
        int a, b, c;
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        int answer = Math.max(b-a, c-b);
        --answer;

        System.out.println(answer);
    }
}
