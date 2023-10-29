package structural.adapter.code.stack.inheritance;

public class DList {

    public DNode head;

    DList() {
        head = null;
    }

    public void insert(DNode pos, Object o) {
    }

    public void remove(DNode pos) {
    }

    public void insertHead(Object o) {
        DNode temp;
        if (this.head == null) {
            this.head = new DNode(null, null, o);
            return;
        }

        temp = new DNode(null, head, o);
        head.previous = temp;
        head = temp;
        temp = null;
    }

    public void insertTail(Object o) {
        DNode insert, tail;
        if (head == null) {
            insertHead(o);
            return;
        }
        tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        insert = new DNode(tail, null, o);
        tail.next = insert;
        tail = null;
    }

    public Object removeHead() {
        DNode temp;
        Object value;

        temp = head;

        if (temp == null) {
            return temp;
        }

        head.previous = null;

        value = head.value;
        head = temp.next;
        temp.next = null;

        return value;
    }

    public Object removeTail() {
        DNode temp;
        Object value;

        if (head == null) {
            return null;
        }

        temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        value = temp.value;
        return value;
    }

    public Object getHead() {
        return this.head.value;
    }

    public Object getTail() {
        DNode temp = this.head;

        while (temp.next != null) {
            temp = temp.next;
        }

        return temp;
    }

    class DNode {

        Object value;
        private DNode previous;
        private DNode next;

        DNode(DNode previous, DNode next, Object value) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }

        public DNode getPrevious() {
            return this.previous;
        }

        public DNode getNext() {
            return this.next;
        }

        public void setPrevious(DNode previous) {
            this.previous = previous;
        }

        public void setNext(DNode next) {
            this.next = next;
        }

    }
}
