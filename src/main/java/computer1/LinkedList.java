package computer1;

public class LinkedList {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

public void addFirst(int data) {

        if (isEmpty()) {
            head = tail = new Node(data, null, null);

        }
        else
        {
            head.setPrev(new Node(data, null, head));
            head = head.getPrev();
        }
        size++;
    }



    public int size() {
        return size;
    }


    public boolean isEmpty() {

        return size() == 0;

    }



    @Override

    public String toString() {

        StringBuilder sb = new StringBuilder();

        Node trav = head;

        while (trav != null) {

            sb.append(trav.toString());

            if (trav.getNext() != null) {

                sb.append(", ");

            }
            trav = trav.getNext();

        }

        return sb.toString();

    }

}