package library;

public class Book {
    private String bookName="";
    private String bookAuthor="";
    private String bookid="";
    private String bookType="";
    private int bookCopy=0;
    
    public Book()
    {
        
    }
    public Book(String name,String author,String id,String type,int copy)
    {
        this.bookName=name;
        this.bookAuthor=author;
        this.bookid=id;
        this.bookType=type;
        this.bookCopy=copy;
    }
    
    public void showInfo()
    {
        System.out.println("Name: "+this.bookName);
        System.out.println("Author: "+this.bookAuthor);
        System.out.println("ID: "+this.bookid);
        System.out.println("Type: "+this.bookType);
        System.out.println("Number of copies: "+this.bookCopy);
    }
    
    public void addBookCopy(int x)
    {
        this.bookCopy+=x;
    }
    
}
