package Project4;

public class BubbleSorter {
    public double[] numberSort(double[] list){

        for (int i = 0; i < list.length - 1 ; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j +1]){
                    double temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }
}
