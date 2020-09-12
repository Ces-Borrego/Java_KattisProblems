import java.util.Scanner;

public class SavingForRetirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bAge = in.nextInt(), bRetireAge = in.nextInt(), bMoneyPerYear = in.nextInt(), aAge = in.nextInt(), aMoneyPerYear = in.nextInt(), aRetireAge = 0;
        int bMoneySaved = (bRetireAge - bAge) * bMoneyPerYear;
        while(aRetireAge * aMoneyPerYear <= bMoneySaved){
            aRetireAge++;
        }
        System.out.println(aRetireAge + aAge);
    }
}
