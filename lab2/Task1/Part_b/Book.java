package Task1.Part_b;

public class Book extends LibraryItem{
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int numberOfPages){
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getItemType(){
        return "Book";
    }

    @Override
    public String toString() {
        return getItemType() + " = " + super.toString() + "; Pages" + numberOfPages;
    }
}
