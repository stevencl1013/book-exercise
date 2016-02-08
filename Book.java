/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages, boolean course)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
        borrowed = 0;
        courseText = course;
    }

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void printDetails()
    {
        if(refNumber.length() == 0)
        {
            System.out.println("Title: "+title+", Author: "+author+", Pages: "+pages+", Reference Number: ZZZ, Number of Times Borrowed: "+borrowed);
        }
        else
        {
            System.out.println("Title: "+title+", Author: "+author+", Pages: "+pages+", Reference Number: "+refNumber+", Number of Times Borrowed: "+borrowed); 
        }
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error: Reference number must be at least 3 characters. Try again.");
        }
      
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void borrow()
    {
        borrowed++;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
}
