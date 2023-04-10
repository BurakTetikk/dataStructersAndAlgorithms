package chapters.chapter_02.listing_02;

public class LowArray {
    private long[] a;

    public LowArray(int size) {
        this.a = new long[size];
    }

    public long getElem(int index) {
        return a[index];
    }

    public void setElem(int index, long value) {
        a[index] = value;
    }
}
