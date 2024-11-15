import java.util.ArrayList;

public class MultiDimensional_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 2; i <= 10; i += 2) {
            list2.add(i);
        }

        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 3; i <= 15; i += 3) {
            list3.add(i);
        }

        mainList.add(list1);
        mainList.add(list3);
        mainList.add(list3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);

            for (int j = 0; j < currList.size(); j++) {

                System.out.print(currList.get(j) + " ");
            }
System.out.println();
        }
       
    }
}
