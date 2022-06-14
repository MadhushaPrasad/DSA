package stack;

public class StackMain {
    public static void main(String[] args) {
        StackX s1 = new StackX(5);//create stack with max size 5
        s1.push(10);//push 10
        s1.push(50);
        s1.push(60);
        s1.push(1);
//        s1.push(15);
        s1.push(95);
        s1.pop();//pop the top element
        s1.peek();//print the top element
    }
}
