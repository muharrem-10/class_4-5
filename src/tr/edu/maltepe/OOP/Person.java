package tr.edu.maltepe.OOP;

import java.util.Vector;

public class Person implements Do_sport {

    private String name;
    private String surname;

    private Vector<Books> pVector = new Vector();

    public Person(String name, String surname) {
        this.setName(name);
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Vector<Books> getpVector() {
        return pVector;
    }

    public void addItem(Books book) {
        getpVector().add(book);
    }

    public void giveBackBook(MaltepeLibrary library, Books book) {
        library.getVector().add(book);
        getpVector().remove(book);
    }


    @Override
    public void play_football(Person person) {
        System.out.println(person.getName() + " " + person.getName() + " football oynuyor");
    }

    @Override
    public void swim(Person person) {
        System.out.println(person.getName() + " " + person.getSurname() + " yüzmeye gidiyor");
    }

    public void setName(String name) {
        this.name = name;
    }
}
