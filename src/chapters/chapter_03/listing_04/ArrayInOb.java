package chapters.chapter_03.listing_04;

public class ArrayInOb {
    private Person[] people;
    private int nELems;

    public ArrayInOb(int max) {
        people = new Person[max];
        nELems = 0;
    }

    public void insert(String last, String first, int a) {
        people[nELems] = new Person(last, first, a);
        nELems++;
    }

    public void display() {
        for (int i = 0; i < nELems; i++) {
            people[i].displayPerson();
        }
        System.out.println();
    }

    public void insertionSort() {
        int in, out;

        for (out = 1; out < nELems; out++) {
            Person temp = people[out];
            in = out;

            while (in > 0 && people[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
                people[in] = people[in - 1];
                --in;
            }
            people[in] = temp;
        }
    }
}
