package structural.adapter.code.stack.inheritance;

public class DListImpStack extends DList implements Stack {

    @Override
    public void push(Object o) {
        insertHead(o);
    }

    @Override
    public Object pop() {
        return removeHead();
    }

    @Override
    public Object top() {
        return this.getHead();
    }

}
