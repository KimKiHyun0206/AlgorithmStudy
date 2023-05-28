package selection_sort;


public class SelectionSort {
    private final static int[] array = {8, 7, 6, 2, 1, 5, 9, 3, 4};
    private final static Service service = new Service();
    private final static View view = new View();

    public static void main(String[] args) {
        int[] answer = service.sort(array);
        view.printAnswer(answer);
    }
}

class Service {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j]<min){
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
        return array;
    }
}

class View{
    public void printAnswer(int[] arr){
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}