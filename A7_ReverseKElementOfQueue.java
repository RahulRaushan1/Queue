package A17_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class A7_ReverseKElementOfQueue {
    public Queue<Integer> mq(Queue<Integer> q, int k)
    {
        Stack<Integer> st=new Stack<>();
        int n=q.size()-k;

        while(k-->0)
        {
            int a=q.peek();
            q.poll();
            st.push(a);
        }
        while (!st.isEmpty())
        {
            int a =st.peek();
            st.pop();
            q.add(a);
        }
        for(int i=0;i<n;i++) {
            int a = q.peek();
            q.poll();
            q.add(a);
        }
        return  q;
    }

    public static void main(String[] args) {
        A7_ReverseKElementOfQueue rev=new A7_ReverseKElementOfQueue();
        Queue<Integer> que=new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        Queue <Integer> newq =rev.mq(que,4);
        System.out.println(newq);

    }
}
