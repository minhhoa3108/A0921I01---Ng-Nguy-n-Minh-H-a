package session13.thuc_hanh;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 7, 12, 15, 16, 18, 20, 89, 92, 100};
        System.out.println(binarySearch(numbers, 7));
    }

    public static int binarySearch(int[] numbers, int value){
        int start = 0;
        int end = numbers.length - 1;
        while (end >= start){
            int mid = (start + end) / 2;
            if (value < numbers[mid]){
                end = mid - 1;
            }else if (value == numbers[mid]){
                return mid;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
