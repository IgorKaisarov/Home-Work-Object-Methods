
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Антуан де Сент", "Экзюпери");
        Author author1 = new Author("Бернар", "Вербер");

        Book book = new Book("Маленький принц", author, 1943);
        Book book1 = new Book("Муравьи", author1, 1990);

        book1.setYear(1991);


        System.out.println("Книга 1: " + book);
        System.out.println("Книга 2: " + book1);

        System.out.println("book1.equals(book1): " + book1.equals(book1));
        System.out.println("book.equals(book): " + book.equals(book));

        System.out.println("book1.hashCode(): " + book.hashCode());
        System.out.println("book2.hashCode(): " + book1.hashCode());



    }
}