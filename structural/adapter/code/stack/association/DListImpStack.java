package structural.adapter.code.stack.association;

public class DListImpStack implements Stack {

    private final DList dlist;

    DListImpStack() {
        dlist = new DList();
    }

    @Override
    public void push(Object o) {
        dlist.insertHead(o);
    }

    @Override
    public Object pop() {
        return dlist.removeHead();
    }

    @Override
    public Object top() {
        return dlist.getHead();
    }

}
