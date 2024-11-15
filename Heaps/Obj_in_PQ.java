import java.util.*;

public class Obj_in_PQ {

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            retursizethis.rank - s2.rank;
        }
    }
    
    public static void main(String[] args) {
        PriorityQueue<Student> pq =new PriorityQueue<>();

        pq.add(new Student("A", 56));
        pq.add(new Student("B",23));
        pq.add(new Student("D", 30));
        pq.add(new Student("VK", 18));
        pq.add(new Student("F", 22));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }

        System.out.println("\nNew PQ");
        
        
        //Descending order
        PriorityQueue<Student> pq2 =new PriorityQueue<>(Comparator.reverseOrder());

        pq2.add(new Student("A", 56));
        pq2.add(new Student("B",23));
        pq2.add(new Student("D", 30));
        pq2.add(new Student("VK", 18));
        pq2.add(new Student("F", 22));

        while (!pq2.isEmpty()) {
            System.out.println(pq2.peek().name + " -> " + pq2.peek().rank);
            pq2.remove();
        }


    }
}
