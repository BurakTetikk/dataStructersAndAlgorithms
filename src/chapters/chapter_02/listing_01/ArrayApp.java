package chapters.chapter_02.listing_01;

public class ArrayApp {
    public static void main(String[] args) {
        long[] arr; // reference to array
        arr = new long[100];

        int nElems = 0; // number of items

        int j; //loop counter

        long searchKey;  //key of item to search for

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;

        nElems = 10;

        for (j = 0; j < nElems; j++)  // display items
            System.out.print(arr[j] + " ");

        System.out.println("");

        searchKey =  66; //find item with key 66

        for (j = 0; j < nElems; j++) { //for each element,
            if (arr[j] == searchKey) // found item?
                break;
        }

        if (j == nElems) { // no
            System.out.println("Can't find " + searchKey);
        } else // yes
            System.out.println("Found " + searchKey);


        searchKey = 55; //delete item with key 55

        for (j = 0; j < nElems; j++) { // look for it
            if (arr[j] == searchKey)
                break;
        }

        for (int k = j; k < nElems; k++) { // move higher ones down
            arr[k] = arr[k + 1];
        }

        nElems--; // decrement size

        for (j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
