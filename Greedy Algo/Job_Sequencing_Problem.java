import java.util.*;

public class Job_Sequencing_Problem {

    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            profit = p;
            deadline = d;
        }

    }

    static Character ch[] = { 'A', 'B', 'C', 'D', 'E', 'F' };

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); // Descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.n(); i++) {
            Job curr = jobs.get(i);

            if (curr.deadline > time) {

                seq.add(curr.id);
                time++;
            }
        }

        // print seuence
        System.out.println("max jobs : " + seq.n());

        for (int i = 0; i < seq.n(); i++) {
            System.out.print(ch[seq.get(i)] + " ");
        }

    }
}
