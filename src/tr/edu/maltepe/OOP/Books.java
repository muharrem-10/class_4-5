package tr.edu.maltepe.OOP;

public class Books {

    private String bookName;

    public Books(String bookName){
        this.setBookName(bookName);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
