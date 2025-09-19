/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Angelo Martino
 * @version 9/19/2025
 */
class Book
{
    //fields
    private String author;
    private String title;
    //added fields
    private int pages;
    private String publisher;
    private int year;
    private String isbn;
    private double price;

    /**
     * Constructor to set values when object is created.
     */
    public Book(String bookAuthor, String bookTitle, int numPages, 
                String pub, int y, String code, double p)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        publisher = pub;
        year = y;
        isbn = code;
        price = p;
    }

    //Methods down below
    // Accessors
    public String getAuthor() { 
        return author; 
    }
    
    public String getTitle() { 
        return title; 
    }
    
    public int getPages() {
        return pages; 
    }
    
    public String getPublisher() { 
        return publisher; 
    }
    
    public int getYear() { 
        return year; 
    }
    
    public String getIsbn() { 
        return isbn; 
    }
    
    public double getPrice() {
        return price; 
    }

    // Mutators
    public void setPages(int numPages) {
        pages = numPages; 
    }
    
    public void setPublisher(String pub) { 
        publisher = pub; 
    }
    
    public void setYear(int y) { 
        year = y; 
    }
    
    public void setIsbn(String code) {
        isbn = code; 
    }
    
    public void setPrice(double p) {
        price = p; 
    }

    // Print utilities
    public void printAuthor() {
        System.out.println("Author: " + author);
    }
    
    public void printTitle() { 
        System.out.println("Title: " + title);
    }

    // Print all details in a nice format
    public void printDetails() {
        System.out.println("Title: " + title + 
                           ", Author: " + author + 
                           ", Pages: " + pages +
                           ", Publisher: " + publisher +
                           ", Year: " + year +
                           ", ISBN: " + isbn +
                           ", Price: $" + price);
    }
}
