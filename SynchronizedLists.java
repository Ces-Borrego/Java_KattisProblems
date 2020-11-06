import java.math.*;
import java.util.*;

public class SynchronizedLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int lists = scan.nextInt();
            if(lists != 0){
                ArrayList<Integer> firstList = new ArrayList<>();
                ArrayList<Integer> secondList = new ArrayList<>();
                ArrayList<Integer> thirdList = new ArrayList<>();
                int[] fourthList = new int[lists];

                for(int x = 0; x < lists; x++) firstList.add(scan.nextInt());
                for(int x = 0; x < lists; x++) thirdList.add(scan.nextInt());
                for(Integer i: firstList) secondList.add(i);

                Collections.sort(secondList);
                Collections.sort(thirdList);

                for(int x = 0; x < secondList.size(); x++) {
                    fourthList[firstList.indexOf(secondList.get(x))] = thirdList.get(x);
                }

                for(Integer i: fourthList) System.out.println(i);
                System.out.print("\n");
            } else break;
        }
    }
}
