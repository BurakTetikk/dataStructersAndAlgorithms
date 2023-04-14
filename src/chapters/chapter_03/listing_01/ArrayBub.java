package chapters.chapter_03.listing_01;

public class ArrayBub {
    private long[] arr;  //ref to array a
    private int nElems; // number of data items

    public ArrayBub(int max) { //constructor
        arr = new long[max]; // creat the array
        nElems = 0; // no items yet
    }

    public void insert(long value) {//put element into array
        arr[nElems] = value; //insert it
        nElems++; //increment size
    }

    public void display() { //display array contest
        for (int j = 0; j < nElems; j++) //for each element,
            System.out.print(arr[j] + " ");//display it

        System.out.println();
    }

    public void bubbleSort() {
        int outer;
        int inner;

        for (outer = nElems - 1; outer > 1; outer--) {//outer loop(backward)
            for (inner = 0; inner < outer; inner++){//inner loop(forward)
                if (arr[inner] > arr[inner + 1]) {//out of order?
                    long temp = arr[inner]; //swap them
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = temp;
                }
            }
        }
    }
}
