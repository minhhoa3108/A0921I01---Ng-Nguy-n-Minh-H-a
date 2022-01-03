package Session11.thuc_hanh.Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        else return false;
    }

    //method pop() lấy ra xem và xóa
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }else{
            return stack.removeFirst();
        }
    }
}
