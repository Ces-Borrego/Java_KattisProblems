import java.util.Scanner;

public class OneChickenPerPerson {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt(), m = keyboard.nextInt(), p;
        boolean positive = true;

        p = m - n;
        if(p < 0) {
            positive = false;
            p = n - m;
        }

        if(positive && p != 1){
            System.out.println("Dr. Chaz will have " + p + " pieces of chicken left over!");
        }else if(positive && p == 1){
            System.out.println("Dr. Chaz will have " + p + " piece of chicken left over!");
        }else if(!positive && p != 1){
            System.out.println("Dr. Chaz needs "+ p +" more pieces of chicken!");
        }else if(!positive && p==1){
            System.out.println("Dr. Chaz needs "+ p +" more piece of chicken!");
        }

    }
}
