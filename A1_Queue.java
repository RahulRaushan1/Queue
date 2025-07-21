package A17_Queue;
import java.util.Queue;
import java.util.LinkedList;
public class A1_Queue {
    public static void main(String[] args) {
        Queue <Integer> que = new LinkedList<>();
        // add or push operation
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        que.poll();
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.size());
        System.out.println(que.isEmpty());
    }
}
