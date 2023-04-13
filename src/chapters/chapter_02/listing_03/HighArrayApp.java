package chapters.chapter_02.listing_03;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100; //array size
        HighArray array; //reference to array

        array = new HighArray(maxSize); //creat the array

        array.insert(77); //insert 10 items
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);

        array.display(); //display items

        System.out.println("highest -> " + array.getMax());


        int searchKey = 35; //search for item

        if (array.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);


        array.delete(00); //delete 3 items
        array.delete(55);
        array.delete(99);

        array.display(); // display items again

        System.out.println("highest -> " + array.getMax());

        array.removeMax();

        array.display();
    }
}
