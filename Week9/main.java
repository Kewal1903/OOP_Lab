package Week9;
import library.Library;
import book.Book;
import member.Member;
import transaction.Transaction;
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter library name: ");
        String libraryName = sc.nextLine();
        Library myLibrary = new Library(libraryName);
        System.out.print("Enter title of the first book: ");
        String title1 = sc.nextLine();
        System.out.print("Enter author of the first book: ");
        String author1 = sc.nextLine();
        Book book1 = new Book(title1, author1);
        System.out.print("Enter title of the second book: ");
        String title2 = sc.nextLine();
        System.out.print("Enter author of the second book: ");
        String author2 = sc.nextLine();
        Book book2 = new Book(title2, author2);
        System.out.print("Enter name of the first member: ");
        String memberName1 = sc.nextLine();
        System.out.print("Enter member ID of the first member: ");
        String memberId1 = sca.nextLine();
        Member member1 = new Member(memberName1, memberId1);
        System.out.print("Enter name of the second member: ");
        String memberName2 = sc.nextLine();
        System.out.print("Enter member ID of the second member: ");
        String memberId2 = sca.nextLine();
        Member member2 = new Member(memberName2, memberId2);
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.registerMember(member1);
        myLibrary.registerMember(member2);
        System.out.print("Enter transaction type for the first transaction: ");
        String transactionType1 = scanner.nextLine();
        Transaction transaction1 = new Transaction(book1, member1, transactionType1);
        transaction1.processTransaction();
        System.out.print("Enter transaction type for the second transaction: ");
        String transactionType2 = scanner.nextLine();
        Transaction transaction2 = new Transaction(book2, member2, transactionType2);
        transaction2.processTransaction();
    }
}
