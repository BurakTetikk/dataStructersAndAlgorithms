package chapters.chapter_02.listing_02;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray lowArray;
        lowArray = new LowArray(100);

        int nElems = 0;
        int j;

        lowArray.setElem(0, 77);
        lowArray.setElem(1, 99);
        lowArray.setElem(2, 44);
        lowArray.setElem(3, 55);
        lowArray.setElem(4, 22);
        lowArray.setElem(5, 88);
        lowArray.setElem(6, 11);
        lowArray.setElem(7, 00);
        lowArray.setElem(8, 66);
        lowArray.setElem(9, 33);

        nElems = 10;

        for (j = 0; j < nElems; j++) { //display items
            System.out.print(lowArray.getElem(j) + " ");
        }
        System.out.println();

        int searchKey = 26;  //search for data item

        for (j = 0; j < nElems; j++) {  //for each element,
            if (lowArray.getElem(j) == searchKey) {  //found item?
                break;
            }
        }

        if (j == nElems) {  //no
            System.out.println("Can't find " + searchKey);
        }else {  //yes
            System.out.println("Found " + searchKey);
        }

        //delete value 55
        for (j = 0; j < nElems; j++) {  //look for it
            if (lowArray.getElem(j) == 55)
                break;
        }

        for (int k = j; k < nElems; k++) {
            lowArray.setElem(k, lowArray.getElem(k + 1));
        }

        nElems--;

        for (j = 0; j < nElems; j++) {
            System.out.print(lowArray.getElem(j) + " ");
        }
    }
}
