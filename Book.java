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
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Constructor to set values when object is created.
     */
    public Book(String bookAuthor, String bookTitle, int numPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;
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
    
    public String getRefNumber() { 
        return refNumber; 
    }
    
    public int getBorrowed() { 
        return borrowed; 
    }
    
    public boolean isCourseText() { 
        return courseText; 
    }

    // Mutators
    public void setPages(int numPages) { 
        pages = numPages; 
    }
    
    public void setRefNumber(String ref) {
        if (ref != null && ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error: refNumber must be at least 3 chars.");
        }
    }
    
    public void borrow() { 
        borrowed = borrowed + 1; 
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
        String refOut = (refNumber.length() > 0) ? refNumber : "ZZZ";
        System.out.println("Title: " + title +
                           ", Author: " + author +
                           ", Pages: " + pages +
                           ", Ref#: " + refOut +
                           ", Borrowed: " + borrowed +
                           ", Course Text: " + (courseText ? "yes" : "no"));
    }
}
