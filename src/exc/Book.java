package exc;

public class Book {

    public String name;

    public String yearPublished;

    public String numberOfPages;

    public Book(String name, String yearPublished, String numberOfPages) {
        this.name = name;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;

    }

    public String getName() {
        return name;
    }

    public String getYearPublished(){
        return yearPublished;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return return "Books{" +
                "bookName" + name +
                ", yearpublished='" + yearPublished + '\'' +
                ", numberofpages='" + numberOfPages + '\'' +
                '}';
    }
    }
}
