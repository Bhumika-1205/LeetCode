class MyCircularQueue {

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    private int size=0;
    private int maxSize;
    private Node front;
    private Node rear;

    public MyCircularQueue(int k) {
        this.maxSize=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        Node newNode=new Node(value);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
            front.next=front;
            size++;
            return true;
        }

        rear.next=newNode;
        rear=newNode;
        rear.next=front;
        size++;
        return true;

    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;

        if(front==rear){
            front=null;
            rear=null;
            size--;
            return true;
        }

        front=front.next;
        rear.next=front;
        size--;
        return true;
    }
    
    public int Front() {
        return isEmpty()?-1:front.val;
    }
    
    public int Rear() {
        return isEmpty()?-1:rear.val;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==maxSize;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
