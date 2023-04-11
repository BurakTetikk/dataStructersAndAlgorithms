package chapters.chapter_02.listing_03;

public class HighArray {
    private long[] a; //ref to array a
    private int nElems; //number of the data items

    public HighArray(int nElems) { //constructor
        a = new long[nElems]; //creat array
        this.nElems = 0; // no items yet
    }

    public boolean find(long searchKey) {  //find specified value
        int j;
        for (j = 0; j < nElems; j++) { //for each element,
            if (a[j] == searchKey) //found item?
                break; //exit loop before end
        }

        if (j == nElems) //gone to end?
            return false; //yes,can't find item
        else
            return true;//no found it
    }

    public void insert(long value) { //put element into array
        a[nElems] = value; //insert it
        nElems++; //increment size
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++){ //look for it
            if (a[j] == value)
                break;
        }

        if (j == nElems) //can't find it
            return false;
        else { //found it
            for (int k = j; k < nElems; k++) { //move higher ones down
                a[k] = a[k + 1];
            }
            nElems--; //decrement size
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }
}
