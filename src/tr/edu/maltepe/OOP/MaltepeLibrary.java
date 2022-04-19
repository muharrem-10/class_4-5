package tr.edu.maltepe.OOP;

import java.util.*;

public class MaltepeLibrary {


    private Vector<Books> vector = new Vector<Books>();


    public Vector<Books> getVector() {
        return vector;
    }
    public void addBook(Books book){
        getVector().add(book);
    }
    public void removeBook(Books book){
        getVector().remove(book);
    }
    public void lendBook(Books book,Person person){
        person.addItem(book);
        getVector().remove(book);
    }
}
