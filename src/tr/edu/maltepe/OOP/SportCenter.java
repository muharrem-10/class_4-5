package tr.edu.maltepe.OOP;

import java.util.Vector;

public class SportCenter {

    public Do_sport doSport;
    private Vector swimPeople = new Vector();
    private Vector footballPeople = new Vector();

    public SportCenter(Do_sport do_sport){
        this.doSport = do_sport;
    }

    public void swimmingField(Person person){
        doSport.swim(person);
        getSwimPeople().add(person.getName());
    }

    public void footballField(Person person){
        doSport.play_football(person);
        getFootballPeople().add(person.getName());
    }

    public Vector getSwimPeople() {
        return swimPeople;
    }

    public Vector getFootballPeople() {
        return footballPeople;
    }
}
