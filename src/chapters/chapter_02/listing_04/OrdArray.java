package chapters.chapter_02.listing_04;

public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int nElems) {
        a = new long[nElems];
        this.nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn; // found it
            else if (lowerBound > upperBound)
                return nElems;
            else //divide range
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1; //it's in upper half
                else
                    upperBound = curIn - 1; //it's in lower half
        }
    }

    public void insert(long value) { //put element into array
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
            if (a[j] > value)
                break;

        for (int k = nElems; k > j; k--) //move bigger ones up
            a[k] = a[k - 1];

        a[j] = value; //insert it
        nElems++; // increment size
    }

    public boolean delete(long value) {
        int j = find(value);

        if (j == nElems) //can't find it
            return false;
        else { //found it
            for (int k = j; k < nElems; k++) //move bigger ones down
                a[k] = a[k + 1];

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
