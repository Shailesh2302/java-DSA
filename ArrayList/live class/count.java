
import java.util.ArrayList;
public class count {

    public static int print(ArrayList<Integer> list, int key){
int num[] = new int[1000];
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) == key) {
                num[list.get(i+1)]++;
                // num[list.get(i-1)]++;

                
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0 ;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                ans = i;
            }
        }
        return ans;
    }
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(100);
    list.add(5);
    list.add(200);
    list.add(1);
    list.add(10);
    list.add(1);
    list.add(100);
    list.add(1);

    System.out.println(print(list, 1));
}
    
}