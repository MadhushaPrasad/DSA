package Queue;

public class Queue {

    private int maxSize;// max size of the queue
    private int[] queueArray;// array to store the queue
    private int fornt;// front of the queue
    private int rear;// rear of the queue
    private int nItems;// number of items in the queue

    public Queue(int size) {
        maxSize = size;// set the size of the queue
        queueArray = new int[maxSize]; // create the array
        fornt = 0;// set the front of the queue to 0
        rear = -1;// set the rear of the queue to -1
        nItems = 0;// set the number of items in the queue to 0
    }

    // insert item into queue
    public void insert(int number) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full");
        } else {
            if (rear == -1) {
                rear = 0;
            }
            queueArray[++rear] = number;// increment rear and insert
            nItems++;// increment number of items
        }
    }

    // remove item from queue
    public int remove() {
        if (rear == -1) {
            System.out.println("Queue is empty");
            return -99;
        } else {
            nItems--;
            return queueArray[fornt++];// increment front and return item
        }
    }

    // peek at front of queue
    public int peek() {
        if (rear == -1) {
            System.out.println("Queue is empty");
            return -99;
        } else {
            return queueArray[fornt];// return item at front
        }
    }

    // check if queue is empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    //check if queue is full
    public boolean isFull() {
        return (nItems == maxSize);
    }

}
