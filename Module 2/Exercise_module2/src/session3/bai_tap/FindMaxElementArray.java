package session3.bai_tap;

public class FindMaxElementArray {
    public static void main(String[] args) {
        int[][] array = {{1,2}, {435, 12}, {23, 45}, {346, 8}, {911, 120}, {20, 1789}, {31, 50}};
        int max = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if(max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("GTLN là: " + max);
    }
}
