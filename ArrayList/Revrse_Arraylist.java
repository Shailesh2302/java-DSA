import java.util.ArrayList;
public class Revrse_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int num = 1;
        for (int i = 0; i < 5; i++) {
            list.add(num);
            num++;
        }
        System.out.println(list);

        for (int i = list.n()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " " );;
        }
        System.out.println();
        System.out.println(list);
    }

    
}
