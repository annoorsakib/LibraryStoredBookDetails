package library;

public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Book b1=new Book("abc","Lamia Islam","123","kids",10);
        Book b2=new Book("Cinderella","P.K. Hudson","00024","fairytale",5);
        Book b3=new Book("Thinking of Java","Dr. K.Hayder","123376","tutorial",50);
        Library lib=new Library("AIUB","kuril");
        lib.addNewBook(b1);
        lib.addNewBook(b2);
        lib.addNewBook(b3);
        lib.showLibInfo();
        System.out.println("--------------------------------");
        lib.addNewBookCopy(b2, 2);
        lib.showLibInfo();
        System.out.println("--------------------------------");
        lib.deleteBook(b2);
        lib.showLibInfo();
    }
    
}
