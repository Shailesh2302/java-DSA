import java.util.ArrayList;
public class Pair_Sum_3 {

    public static boolean pair(ArrayList<Integer> list, int tar){
        int bp = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
int lp = bp + 1, rp = bp;
int size= list.size();

while (lp != rp) {
    if (list.get(lp) + list.get(rp) == tar) {
        return true;
    }

    if (list.get(lp) + list.get(rp) < tar) {
        lp = (lp + 1) % size;
    }else{
        rp = (size+ rp - 1) % size;
    }
}
return false;
    }
    public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<>();

list.add(11);
list.add(15);
list.add(6);
list.add(8);
list.add(9);
list.add(10);

System.out.println(pair(list, 16));
    }
}
