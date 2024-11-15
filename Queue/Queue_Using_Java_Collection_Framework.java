import java.util.*;
public class Queue_Using_Java_Collection_Framework {

    public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<Integer>();
// Queue<Integer> q = new ArrayDeque<>();
      q.add(1);
      q.add(2);
      q.add(3);

      while (!q.isEmpty()) {
        System.out.print(q.peek() + " ");
        q.remove();
      }
    }
    
}
