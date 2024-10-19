import java.util.*;

// To add an element at the bottom of the stack using recursion
// 1. Remove top elements
// 2. Add the element to the bottom
// 3. Re-add the removed elements

public class addElemetBottom {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);  // Base case: if stack is empty, add the element
            return;
        }
        int top = s.pop();   // Remove the top element
        pushAtBottom(data, s);  // Recursive call to push the element to the bottom
        s.push(top);  // Re-add the removed element
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(56);
        st.push(34);
        st.push(78);
        st.push(89);

        pushAtBottom(100, st);  // Corrected the stack name to 'st'

        // Print the stack
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
