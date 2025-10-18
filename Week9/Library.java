package library;
import book.Book;
import member.Member;
public class Library {
    private String name;
    public Library(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Library name cannot be null or empty.");
        }
        this.name = name;
    }
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        System.out.println(book.getTitle()+ " by " + book.getAuthor() + " added to the library.");
    }
    public void registerMember(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("Member cannot be null.");
        }
        System.out.println("Member " + member.getName() + " registered.");
    }
    public String getName() {
        return name;
    }
}
