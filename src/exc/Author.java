package exc;

import java.util.Arrays;

public class Author {

    private String name;
    private Book[] bookWriten;

    public Author(String name) {
        this.name = name;
        bookWriten=new Book[4];
    }

    public void setBookWriten(Book[] bookWriten) {
        this.bookWriten = bookWriten;
    }

    public double getAvragePageNumber(){
        int sum = 0;
        for (int i = 0; i < bookWriten.length; i++) {
            //sum += bookWriten[i].getNumberOfPages();
        }
        return (double) (sum / bookWriten.length);

    }

    @Override
    public String toString() {
       // return "Author name: " + name + ",\n Employees: " + Arrays.toString(bookWriten)
                //+ ",\n their average age: " + getNumberOfPages();
        return null;
    }}

//}}

