package tr.edu.maltepe.OOP;

public class Profesor extends Person {

    private long pId;

    public Profesor(String name, String surname,long pId) {
        super(name, surname);
        this.setpId(pId);
    }

    public long getpId() {
        return pId;
    }

    public void addItem(Books book){
        getpVector().add(book);
    }

    @Override
    public void play_football(Person person) {
        System.out.println(person.getName() + " " + person.getSurname() + " football oynuyor. Id=="+ getpId());
    }

    @Override
    public void swim(Person person){
        System.out.println(person.getName() + " " + person.getSurname() + " yüzmeye gidiyor. Id=="+ getpId());
    }

    public void setpId(long pId) {
        this.pId = pId;
    }
}
