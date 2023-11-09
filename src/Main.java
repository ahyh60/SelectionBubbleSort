public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr[] = { 2, 3, 4, 10, 40 };

    }


    public void selectionSort(int[] array){
        for(int i = 0; i < array.length-1; i++ ){
            int minIndex = i;
            for(int j = i+1; j < array.length; j++ ){
                if(array[minIndex] > array[j])
                    minIndex = j;
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }

    public void bubbleSort(int[] array){
       for(int i = 0; i < array.length-1; i++){
           for(int j = 0; j < array.length-1; j++){
               if(array[j] > array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
           }
       }
    }
}
