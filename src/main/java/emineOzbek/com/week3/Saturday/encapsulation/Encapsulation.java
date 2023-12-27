package emineOzbek.com.week3.Saturday.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {

        Book book = new Book();
        book.setBookName("1984");
        book.setAuthor("George Orwell");
        book.setPageNumber(256);

        System.out.println("Kitap Adı: " +  book.getBookName());
        System.out.println("Kitap Yazarı: " +  book.getAuthor());
        System.out.println("Kitap Sayfa Sayısı: " +  book.getPageNumber());
    }
}
