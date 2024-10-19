public class ImpleUsingArrays {

    int stack[]=new int[5];
    int top=0;
    public void push(int data){
        stack[top]=data;
        top++;
    }
    public int pop(){
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    public int peek(){
        int data;
        data=stack[top-1];
        return data;
    }

    public void display(){
        for(int i=0;i<stack.length;i++){
            System.out.println(stack[i]);

        }
    }

    public static void main(String[] args) {
        ImpleUsingArrays arr=new ImpleUsingArrays();
        arr.push(10);
        arr.push(20);
        arr.push(30);
        arr.push(40);
        arr.push(50);
        System.out.println(arr.pop());
        System.out.println("Peek element is " + arr.peek());
        arr.display();
    }
}
