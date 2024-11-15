import java.util.*;

public class Insert_In_Heap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);

            int x = arr.n() - 1; // x is child index

            int y = (x - 1) / 2;// y is Parent index

            while (arr.get(x) < arr.get(y)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(y));
                arr.set(y, temp);
            }
        }

        public int peek() {
            retursizearr.get(0);
        }
    }

    public static void main(String[] args) {

    }
}
