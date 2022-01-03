package Session11.thuc_hanh.Stack;

public class GenericStackClient {
    private static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");

        System.out.println("1.1 Size of stack after push element: " + stack.size());
        System.out.println("1.2 Pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%s\t", stack.pop());
        }
        System.out.println("\n1.3: Size of stack after pop element: " + stack.size());
    }

    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("2.1 Size of stack after push element: " + stack.size());
        System.out.println("2.2 Pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%d\t", stack.pop());
        }
        System.out.println("\n2.3: Size of stack after pop element: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. STACK OF STRINGS");
        stackOfStrings();
        System.out.println("------------------------");
        System.out.println("STACK OF INTEGERS");
        stackOfIntegers();
    }
}
