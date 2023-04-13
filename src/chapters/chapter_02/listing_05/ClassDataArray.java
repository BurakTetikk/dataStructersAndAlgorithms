package chapters.chapter_02.listing_05;

public class ClassDataArray {
    private Person[] person;
    private int nElems;

    public ClassDataArray(int max) {
        person = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (person[j].getLast().equals(searchName))
                break;
        }
        if (j == nElems)
            return null;
        else
            return person[j];
    }

    public void insert(String last, String first, int age) {
        person[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (person[j].getLast().equals(searchName))
                break;
        }

        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                person[k] = person[k + 1];

            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            person[j].displayPerson();
        }
    }
}
