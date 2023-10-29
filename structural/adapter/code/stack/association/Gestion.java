package structural.adapter.code.stack.association;

public class Gestion {

    public static void main(String[] args) {
        Stack stack = new DListImpStack();

        stack.push("first");
        stack.push("second");
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
