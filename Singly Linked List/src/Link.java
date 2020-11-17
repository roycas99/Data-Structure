public class Link {
    public String bookName;
     int year;
     Link next;

    public Link(String bookName,int year){
        this.bookName=bookName;
        this.year=year;
    }
    public void display(){
        System.out.println(bookName + ":" + year + " read");

    }

    @Override
    public String toString() {
        return bookName ;
    }
}
