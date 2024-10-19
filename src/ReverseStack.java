import java.util.Stack;

public class ReverseStack {
        public static void pushAtBottom(int data, Stack<Integer> s) {
            if (s.isEmpty()) {
                s.push(data);  // Base case: if stack is empty, add the element
                return;
            }
            int top = s.pop();   // Remove the top element
            pushAtBottom(data, s);  // Recursive call to push the element to the bottom
            s.push(top);  // Re-add the removed element
        }

        public static void reverse(Stack<Integer>s) {
            if(s.isEmpty()) {
                return;
            }
            int top = s.pop();
            reverse(s);
            pushAtBottom(top, s);
        }
        public static void main(String[] args) {
            java.util.Stack<Integer> st = new Stack<Integer>();
            st.push(1);
            st.push(3);
            st.push(5);

            reverse(st);  // Corrected the stack name to 'st'

            // Print the stack
            while (!st.isEmpty()) {
                System.out.println(st.peek());
                st.pop();
            }
        }
    }
