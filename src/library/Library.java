package library;

public class Library {
  private String libName="";
    private String libAddress="";
    private Book listOfBook[];
    private int totalBook=0;
    
    public Library()
    {
                
    }
    public Library(String libName,String libAddress)
    {
        this.libName=libName;
        this.libAddress=libAddress;
        listOfBook=new Book[1000];
    }
    public void showLibInfo()
    {
        System.out.println("library name: "+this.libName);
        System.out.println("Address: "+this.libAddress);
        System.out.println("total book collection: "+this.totalBook);
        for(int i=0;i<totalBook;i++)
        {
            System.out.println(i+".");
            listOfBook[i].showInfo();
        }
    }
    public void addNewBook(Book book)
    {
        listOfBook[totalBook]=book;
        totalBook++;
    }
    public void deleteBook(Book book)
    {
        for(int i=0;i<listOfBook.length;i++)
        {
            if(listOfBook[i]==book)
            {
                for(int j=i;j<listOfBook.length-1;j++)
                {
                    listOfBook[j]=listOfBook[j+1];
                }
            }
        }
        totalBook--;
    }
    void addNewBookCopy(Book book,int copy)
    {
       book.addBookCopy(copy);
    }
  
}
