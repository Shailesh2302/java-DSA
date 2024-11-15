import java.util.*;

public class Activity_Selectiosize{


    //for unsorted end
    public static int maxact(int[] start, int[] end){

        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();

        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 0; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        for (int j = 0; j < ans.n(); j++) {
            System.out.print("A" + ans.get(j) + " ");
        }
        System.out.println();
retursizemaxAct;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        // // end time basis sorted
        // int maxAct = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // // 1st Activity
        // maxAct = 1;
        // ans.add(0);
        // int lastEnd = end[0];

        // for (int i = 0; i < end.length; i++) {
        //     if (start[i] >= lastEnd) {
        //         // Activitty select
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }
        // System.out.println("Max Activities : " + maxAct);

        // for (int i = 0; i < ans.n(); i++) {
        //     System.out.print("A" + ans.get(i) + " ");
        // }

        System.out.println(maxact(start,end));
    }
}
