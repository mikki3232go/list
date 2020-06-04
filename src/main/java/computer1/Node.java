package computer1;

public class Node {

    private int data;
    private Node prev;
    private Node next;

    public Node(int data, Node prev, Node next) {

        this.data = data;
        this.prev = prev;
        this.next = next;

    }



    public Node getPrev() {

        return prev;

    }



    public void setPrev(Node prev) {

        this.prev = prev;

    }



    public Node getNext() {

        return next;

    }



    public void setNext(Node next) {

        this.next = next;

    }



    @Override

    public String toString() {
        return String.valueOf(data);
    }

}