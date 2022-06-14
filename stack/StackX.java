package stack;

public class StackX {
    int[] stackArray;//stack array variable
    int top;//top index variable
    int maxSize;//max size variable

    //parameterized constructor
    public StackX(int size) {
        maxSize = size;//set max size
        top = -1;//set top to -1
        stackArray = new int[maxSize];//create stack array
    }

    //    implement the push method
    public void push(int number) {
        if (top == maxSize - 1) {//if top is at max size
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = number;//increment top and set value to number
        }
    }

    //implement pop() method
    public void pop() {
        if (top == -1) {//if top is at -1
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped element is " + stackArray[top--]);//decrement top and print popped element
        }
    }

    //    implement the peek() method
    public void peek() {
        if (top == -1) {//if top is at -1
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + stackArray[top]);//print top element
        }
    }

    //    implement the isEmpty() method
    public boolean isEmpty() {
        //if top is at -1
        return top == -1;
    }

    //    implement the isFull() method
    public boolean isFull() {
        //if top is at max size
        return top == maxSize - 1;
    }

}
