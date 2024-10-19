public class UsingLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        private Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty. Cannot pop.");
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty. Cannot peek.");
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(56);
        st.push(34);
        st.push(78);
        st.push(89);
        st.push(27);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
