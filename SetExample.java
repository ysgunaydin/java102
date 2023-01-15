import java.util.Comparator;
import java.util.TreeSet;


class Book implements Comparable{

    private String name;
    private int pageNum;
    private String author;
    private String publicationDate;

    public Book(String name, int pageNum, String author, String publicationDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + ", Page: " + pageNum  + ", Author: " + author + ", publication: " + publicationDate;
    }
    
    @Override
    public int compareTo(Object o) {
        Book temp = (Book) o;
        return this.name.compareTo(temp.getName());
    }
}

class Test{
    public static void main(String[] args){
        Book b1 = new Book("Lord of the Rings", 980, "Tolkien", "01/01/1990");
        Book b2 = new Book("Crime and Punishment", 800, "Tolstoy", "01/01/1886");
        Book b3 = new Book("Harry Potter", 700, "J. K. Rowling", "01/01/1997");
        Book b4 = new Book("Talk Like Ted", 450, "Carmine Gallo", "01/01/2020");
        Book b5 = new Book("Outliers", 320, "Malcolm Gladwell", "01/01/1990");
        
        TreeSet<Book> set1 = new TreeSet<>();
        set1.add(b1);
        set1.add(b2);
        set1.add(b3);
        set1.add(b4);
        set1.add(b5);
        
        for (Book b: set1){
            System.out.println(b);
        }
        
        System.out.println("********************************************");
        
        TreeSet<Book> set2 = new TreeSet<>(new Comparator<Book>() {
                  @Override
                  public int compare(Book o1, Book o2) {
                        //using Comparator to sort elements in descending order according to their page number.
                        return o1.getPageNum() - o2.getPageNum();
                  }
           });  // .reversed can be used for ascending order.
        set2.add(b1);
        set2.add(b2);
        set2.add(b3);
        set2.add(b4);
        set2.add(b5);
        
        for (Book b: set2){
            System.out.println(b);
        }
        
    }
}
