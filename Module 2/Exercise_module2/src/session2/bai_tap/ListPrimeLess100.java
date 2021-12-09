package session2.bai_tap;

public class ListPrimeLess100 {
    public static void main(String[] args) {
        int count = 0;
        int m = 2;
        while (true) {
            int mark = 1;
            for(int i = 2; i <= Math.sqrt(m); i++){
                if (m % i == 0) {
                    mark = 0;
                    break;
                }
            }
            if(mark == 1){
                count++;
                System.out.print(m + ", ");
            }
            if (m >= 100) {
                break;
            }
            m++;
        }
    }
}
