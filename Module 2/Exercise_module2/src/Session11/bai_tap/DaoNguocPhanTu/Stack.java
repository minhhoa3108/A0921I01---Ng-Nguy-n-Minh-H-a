package Session11.bai_tap.DaoNguocPhanTu;

import java.util.*;

class Stack <T>{
    private LinkedList<T> stack;

    public Stack(){
        stack = new LinkedList();
    }

    public void NhapPhanTu(T element){
        stack.addFirst(element);
    }

    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }else{
            return false;
        }
    }

//    public void peek(){
//        if(isEmpty()){
//            throw new EmptyStackException();
//        }else{
//            return stack.;
//        }
//    }
}
