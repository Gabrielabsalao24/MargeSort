public class App {
    public static void main(String[] args) {

        int array[] = {85,99,98,97,96,95,94,93,92,91,90,89, 87,86, 74};

        MergeSort sorting = new MergeSort();

        System.out.print("Desordenado:   ");
        sorting.printArray(array);


        sorting.mergeSort(array, 0, array.length - 1);

        System.out.print("Ordenado:      ");
        sorting.printArray(array);

    }
}
