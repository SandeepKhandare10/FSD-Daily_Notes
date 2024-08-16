package Queue;
import java.util.LinkedList;
import java.util.Queue;

    public class QueueAsStack {
          Queue<Integer> queue=new LinkedList<>();

        public void push(int element) {
            queue.add(element); 
            int size = queue.size();
            for (int i = 1; i < size; i++) {
                queue.add(queue.remove());
            }
        }
        public int pop() {
            if (queue.isEmpty()) {
                System.out.println("Stack is Empty");

            }
            return queue.remove();

        }

        public int top() {
            if (queue.isEmpty()) {
                System.out.println("Stack is empty");
            }
            return queue.peek();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public static void main(String[] args) {
            QueueAsStack stack = new QueueAsStack();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("Top element is: " + stack.top());
            System.out.println("Popped element is: " + stack.pop());
            System.out.println("Top element is: " + stack.top());
            stack.push(4);
            System.out.println("Popped element is: " + stack.pop());
            System.out.println("Top element is: " + stack.top());

        }
    }
