package tr.edu.maltepe.OOP;



public class Main {

    public static void main(String[] args) {

        MaltepeLibrary maltepeLibrary = new MaltepeLibrary();
        Person person = new Person("kadri","ışık");
        Student student = new Student("muharrem","bahçeci","en");
        Profesor profesor = new Profesor("ensar","gül",1324);

        Books book1 = new Books("introduction to java");
        Books book2 = new Books("middle to java");
        Books book3 = new Books("hard to java");

        maltepeLibrary.addBook(book1);
        maltepeLibrary.addBook(book2);
        maltepeLibrary.addBook(book3);
        printLibraryBooks(maltepeLibrary);

        maltepeLibrary.lendBook(book3,student);
        maltepeLibrary.lendBook(book2,profesor);
        printLibraryBooks(maltepeLibrary);

        student.giveBackBook(maltepeLibrary,book3);
        profesor.giveBackBook(maltepeLibrary,book2);
        printLibraryBooks(maltepeLibrary);

        System.out.println("***********************************************************");



        SportCenter sportCenter = new SportCenter(new Student("muharrem","bahçeci","Tr"));
        sportCenter.footballField(student);
        sportCenter.swimmingField(student);


        SportCenter sportCenter1 = new SportCenter(new Profesor("ensar","gül",1321));
        sportCenter1.footballField(profesor);
        sportCenter1.swimmingField(profesor);

        for (int i = 0; i < sportCenter.getSwimPeople().size(); i++) {
            System.out.println("havuzda yüzenler; "+sportCenter.getSwimPeople().get(i));
        }
        System.out.println("---------------------------------------");

        for (int i = 0; i < sportCenter.getFootballPeople().size(); i++) {
            System.out.println("football oynayanlar; "+sportCenter.getFootballPeople().get(i));
        }
        System.out.println("---------------------------------------");

    }

    private static void printLibraryBooks(MaltepeLibrary maltepeLibrary) {
        for (int i = 0; i < maltepeLibrary.getVector().size(); i++) {
            System.out.println(maltepeLibrary.getVector().get(i).getBookName());
        }
        System.out.println("---------------------------------------");
    }
}
