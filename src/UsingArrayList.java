import java.util.*;
public class UsingArrayList {
        static class Stack {
            private ArrayList<Integer> list;

            public Stack() {
                list = new ArrayList<>();
            }

            public boolean isEmpty() {
                return list.isEmpty();
            }

            public void push(int data) {
                list.add(data);  // Add the element to the end (top of the stack)
            }

            public int pop() {
                if (isEmpty()) {
                    throw new IllegalStateException("Stack is empty. Cannot pop.");
                }
                return list.remove(list.size() - 1);  // Remove and return the last element (top of the stack)
            }

            public int peek() {
                if (isEmpty()) {
                    throw new IllegalStateException("Stack is empty. Cannot peek.");
                }
                return list.get(list.size() - 1);  // Return the last element (top of the stack) without removing it
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


