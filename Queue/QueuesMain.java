package Queue;

public class QueuesMain {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(10);
        q.insert(52);
        q.insert(63);
        q.insert(84);
        q.insert(5);

        System.out.println(q.remove());//remove the first element
        System.out.println(q.remove());//remove the first element
        System.out.println(q.peek());//print the first element
    }
}
