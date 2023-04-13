package chapters.chapter_02.listing_04;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100; //array size
        OrdArray array; //reference to array
        array = new OrdArray(maxSize);// create the array

        array.insert(77); // insert 10 items
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);

        int searchKey = 55; //search for item
        if (array.find(searchKey) != array.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't " + searchKey);


        array.display();//display items

        array.delete(00); //delete 3 items
        array.delete(55);
        array.delete(99);

        array.display(); // display items again
    }
}
