package session14.thuc_hanh;

public class SelectionSort {
    static double[] list = {1,3342, 15, 204, 50, 48};

    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++){
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Mangr chưa sắp xếp: ");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i] + "\t");
        }

        System.out.println("-----------------");

        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
