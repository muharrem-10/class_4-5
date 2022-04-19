package tr.edu.maltepe.OOP;

public class Student extends Person{

    private String language;

    public Student(String name, String surname,String language) {
        super(name, surname);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public void play_football(Person person) {
        System.out.println(person.getName() + " " + person.getSurname() + " football oynuyor. language==" + getLanguage());
    }

    @Override
    public void swim(Person person) {
        System.out.println(person.getName() + " " + person.getSurname() + " yüzmeye gidiyor.  language==" + getLanguage());
    }

}
