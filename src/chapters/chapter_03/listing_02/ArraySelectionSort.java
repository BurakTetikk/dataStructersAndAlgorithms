package chapters.chapter_03.listing_02;

public class ArraySelectionSort {
    private long[] arr;//ref to array arr
    private int nElems; //number of data items

    public ArraySelectionSort(int max) { //constructor
        arr = new long[max]; //create the array
        nElems = 0; //no items yet
    }

    public void insert(long value) {// put the element into array
        arr[nElems] = value;//insert it
        nElems++; //increment size
    }

    public void display() { // displays array contents
        for (int j = 0; j < nElems; j++) { // for each element,
            System.out.print(arr[j] + " ");//display it
        }
        System.out.println();
    }

    public void selectionSort() {
        int outer;
        int inner;
        int min;

        for (outer = 0; outer < nElems - 1; outer++) { //outer loop
            min = outer; //minimum
            for (inner = outer + 1; inner < nElems; inner++)//inner looğ
                if (arr[inner] < arr[min])//if min greater,
                    min = inner;//we have anew min
            swap(outer, min); //swap them
        }
    }

    private void swap(int outer, int min) {
        long temp = arr[outer];
        arr[outer] = arr[min];
        arr[min] = temp;
    }
}
