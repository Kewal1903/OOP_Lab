package transaction;
import book.Book;
import member.Member;
public class Transaction {
    private Book book;
    private Member member;
    private String transactionType;
    public Transaction(Book book, Member member, String transactionType) {
        if (book == null || member == null) {
            throw new IllegalArgumentException("Book and member cannot be null.");
        }
        if (!transactionType.equalsIgnoreCase("borrow") && !transactionType.equalsIgnoreCase("return")) {
            throw new IllegalArgumentException("Invalid transaction type.");
        }
        this.book = book;
        this.member = member;
        this.transactionType = transactionType;
    }
    public void processTransaction() {
        if (transactionType.equalsIgnoreCase("borrow")) {
            System.out.println(member.getName() + " borrowed the book " + book.getTitle());
        } else {
            System.out.println(member.getName() + " returned the book " + book.getTitle());
        }
    }
}

