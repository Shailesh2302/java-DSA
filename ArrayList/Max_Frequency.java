import java.util.*;
public class Max_Frequency {

    public static int mostFrequent(ArrayList<Integer> list, int key){
        int count[] = new int[1001];

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1) == key ) {
                count[list.get(i)]++;
            }
        }

        int maxIndex = 0;
// int ans = 0;
        for (int i = 0; i < count.length; i++) {
            // maxIndex = count[i] > count[maxIndex] ? i : maxIndex;

            if (count[i] > count[maxIndex]) {
                maxIndex = i;
                // ans = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);

        System.out.println(mostFrequent(list, 4));
    }

}
