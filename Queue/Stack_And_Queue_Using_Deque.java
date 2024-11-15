import java.util.*;
public class Stack_And_Queue_Using_Deque {
    
    static class Stack{
         Deque<Integer> dq = new LinkedList<>();

         public void push(int data){
            dq.addLast(data);
         }

         public int pop(){
            retursizedq.removeLast();
         }

         public int peek(){
            retursizedq.getLast();
         }
    }

   static class Queue{
    Deque<Integer> dq = new LinkedList<>();


    public void add(int data){
       dq.addLast(data); 
    }

    public int remove(){
        retursizedq.removeFirst();
    }

    public int peek(){
        retursizedq.getFirst();
    }
   } 

    public static void main(String[] args) {
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println("Peek : " + s.peek());

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek : " + q.peek());
    }
}
